package com.hr.c2c.social.govern.report.controller;

import com.hr.c2c.social.govern.report.domain.ReportTask;
import com.hr.c2c.social.govern.report.service.ReportTaskService;
import com.hr.c2c.social.govern.report.service.ReportTaskVoteService;
import com.hr.c2c.social.govern.reviewer.api.ReviewerService;
import com.hr.c2c.social.govern.reward.api.RewardService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: c2c-social-govern
 * @description:
 * @author: huangrui
 * @create: 2020-11-23 11:48
 **/

@RestController
public class ReportController {

    @Reference(
            version = "1.0.0",
            interfaceClass = ReviewerService.class,
            cluster ="failfast"
    )
    private ReviewerService reviewerService;

    @Reference(
            version = "1.0.0",
            interfaceClass = RewardService.class,
            cluster = "failfast"
    )
    private RewardService rewardService;

    @Autowired
    private ReportTaskService reportTaskService;

    @Autowired
    private ReportTaskVoteService reportTaskVoteService;

    /**
     * 测试评审员服务
     * @param str 测试字符串
     * @return
     */
    @GetMapping("testReviewer")
    public String testReviewer(String str) {
        return reviewerService.reviewerTest(str);
    }

    /**
     * 测试奖励服务
     * @param str 测试字符串
     * @return
     */
    @GetMapping("testReward")
    public String testReward(String str) {
        return rewardService.rewardTest(str);
    }

    /**
     * 提交举报的接口
     * @param type 举报类型
     * @param reportUserId 举报人id
     * @param reportContent 举报内容
     * @param targetId 举报目标id
     * @return
     */
    public String report(String type,
                         Long reportUserId,
                         String reportContent,
                         Long targetId) {
        ReportTask reportTask = new ReportTask();
        reportTask.setType(type);
        reportTask.setReportUserId(reportUserId);
        reportTask.setReportContent(reportContent);
        reportTask.setTargetId(targetId);

        //本地数据库增加一个举报任务
        reportTaskService.add(reportTask);

        // 调用评审员服务，选择一批评审员
        List<Long> reviewerIds = reviewerService.selectReviewers(reportTask.getId());
        // 在本地数据库初始化这批评审员对举报任务的投票状态
        reportTaskVoteService.initVotes(reviewerIds, reportTask.getId());

        // 模拟发送push消息给评审员
        System.out.println("模拟发送push消息给评审员.....");

        return "success";
    }
}

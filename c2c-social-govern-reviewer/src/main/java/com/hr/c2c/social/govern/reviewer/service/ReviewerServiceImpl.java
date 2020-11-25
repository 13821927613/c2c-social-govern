package com.hr.c2c.social.govern.reviewer.service;

import com.hr.c2c.social.govern.reviewer.api.ReviewerService;
import com.hr.c2c.social.govern.reviewer.dao.ReviewerTaskStatusDao;
import com.hr.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: c2c-social-govern
 * @description: 评审员服务的接口实现类
 * @author: huangrui
 * @create: 2020-11-23 15:27
 **/

@Service(
        version = "1.0.0",
        interfaceClass = ReviewerService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class ReviewerServiceImpl implements ReviewerService{

    @Autowired
    private ReviewerTaskStatusDao reviewerTaskStatusDao;

    @Override
    public String reviewerTest(String str) {
        return "reviewer test:\n\thello " + str;
    }

    @Override
    public List<Long> selectReviewers(Long reportTaskId) {

        //模拟通过算法选择一批评审员
        System.out.println("模拟通过算法选择一批评审员");

        List<Long> reviewerIds = new ArrayList<>();
        reviewerIds.add(1L);
        reviewerIds.add(2L);
        reviewerIds.add(3L);
        reviewerIds.add(4L);
        reviewerIds.add(5L);

        //把每个要执行的任务录入数据库
        for (Long reviewerId : reviewerIds) {
            ReviewerTaskStatus reviewerTaskStatus = new ReviewerTaskStatus();
            reviewerTaskStatus.setReportTaskId(reportTaskId);
            reviewerTaskStatus.setReviewerId(reviewerId);
            reviewerTaskStatus.setStatus(ReviewerTaskStatus.PROCESSING);
            reviewerTaskStatusDao.add(reviewerTaskStatus);
        }

        return reviewerIds;
    }
}

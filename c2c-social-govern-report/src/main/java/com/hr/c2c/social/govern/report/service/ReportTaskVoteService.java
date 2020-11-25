package com.hr.c2c.social.govern.report.service;

import java.util.List;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票Service接口
 * @author: huangrui
 * @create: 2020-11-24 15:49
 **/

public interface ReportTaskVoteService {

    /**
     * 初始化评审员对举报任务的投票
     * @param reviewerIds 评审员id
     * @param reportTaskId 举报任务id
     */
    void initVotes(List<Long> reviewerIds, Long reportTaskId);
}

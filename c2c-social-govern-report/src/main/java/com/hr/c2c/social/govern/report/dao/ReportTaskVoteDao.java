package com.hr.c2c.social.govern.report.dao;

import com.hr.c2c.social.govern.report.domain.ReportTaskVote;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票Dao接口
 * @author: huangrui
 * @create: 2020-11-24 15:07
 **/

public interface ReportTaskVoteDao {

    /**
     * 添加举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    void add(ReportTaskVote reportTaskVote);
}

package com.hr.c2c.social.govern.report.dao;

import com.hr.c2c.social.govern.report.domain.ReportTask;

/**
 * @program: c2c-social-govern
 * @description: 举报任务DAO接口
 * @author: huangrui
 * @create: 2020-11-24 14:56
 **/

public interface ReportTaskDao {

    /**
     * 增加一个举报任务
     * @param reportTask 举报任务
     */
    void add(ReportTask reportTask);
}

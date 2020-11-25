package com.hr.c2c.social.govern.report.service;

import com.hr.c2c.social.govern.report.domain.ReportTask;

/**
 * @program: c2c-social-govern
 * @description: 举报任务Service接口
 * @author: huangrui
 * @create: 2020-11-24 15:11
 **/

public interface ReportTaskService {

    /**
     * 增加举报任务
     * @param reportTask 举报任务
     */
    void add(ReportTask reportTask);
}

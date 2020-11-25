package com.hr.c2c.social.govern.report.dao.impl;

import com.hr.c2c.social.govern.report.dao.ReportTaskDao;
import com.hr.c2c.social.govern.report.domain.ReportTask;
import com.hr.c2c.social.govern.report.mapper.ReportTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @program: c2c-social-govern
 * @description: 举报任务DAO实现类
 * @author: huangrui
 * @create: 2020-11-24 14:57
 **/
@Repository
public class ReportTaskDaoImpl implements ReportTaskDao {

    @Autowired
    private ReportTaskMapper reportTaskMapper;

    /**
     *
     * @param reportTask 举报任务
     */
    @Override
    public void add(ReportTask reportTask) {
        reportTaskMapper.insert(reportTask);
    }
}

package com.hr.c2c.social.govern.report.service.impl;

import com.hr.c2c.social.govern.report.dao.ReportTaskDao;
import com.hr.c2c.social.govern.report.domain.ReportTask;
import com.hr.c2c.social.govern.report.service.ReportTaskService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @program: c2c-social-govern
 * @description: 举报任务Service接口实现类
 * @author: huangrui
 * @create: 2020-11-24 15:47
 **/

@Service
@Component("reportTaskService")
public class ReportTaskServiceImpl implements ReportTaskService {

    private ReportTaskDao reportTaskDao;

    @Override
    public void add(ReportTask reportTask) {
        reportTaskDao.add(reportTask);
    }
}

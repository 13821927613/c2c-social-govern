package com.hr.c2c.social.govern.report.dao.impl;

import com.hr.c2c.social.govern.report.dao.ReportTaskVoteDao;
import com.hr.c2c.social.govern.report.domain.ReportTaskVote;
import com.hr.c2c.social.govern.report.mapper.ReportTaskVoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票Dao接口实现类
 * @author: huangrui
 * @create: 2020-11-24 15:08
 **/
@Repository
public class ReportTaskVoteDaoImpl implements ReportTaskVoteDao {

    @Autowired
    private ReportTaskVoteMapper reportTaskVoteMapper;

    @Override
    public void add(ReportTaskVote reportTaskVote) {
        reportTaskVoteMapper.insert(reportTaskVote);
    }
}

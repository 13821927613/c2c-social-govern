package com.hr.c2c.social.govern.report.service.impl;

import com.hr.c2c.social.govern.report.dao.ReportTaskVoteDao;
import com.hr.c2c.social.govern.report.domain.ReportTaskVote;
import com.hr.c2c.social.govern.report.service.ReportTaskVoteService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票Service接口实现类
 * @author: huangrui
 * @create: 2020-11-24 15:51
 **/

@Service
@Component("reportTaskVoteService")
public class ReportTaskVoteServiceImpl implements ReportTaskVoteService {

    @Autowired
    private ReportTaskVoteDao reportTaskVoteDao;

    @Override
    public void initVotes(List<Long> reviewerIds, Long reportTaskId) {

        for(Long reviewerId : reviewerIds) {
            ReportTaskVote reportTaskVote = new ReportTaskVote();
            reportTaskVote.setReviewerId(reviewerId);
            reportTaskVote.setReportTaskId(reportTaskId);
            reportTaskVote.setVoteResult(ReportTaskVote.UNKNOWN);

            reportTaskVoteDao.add(reportTaskVote);
        }
    }
}

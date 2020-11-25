package com.hr.c2c.social.govern.report.domain;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票
 * @author: huangrui
 * @create: 2020-11-24 11:16
 **/

public class ReportTaskVote {

    /**
     * 未投票
     */
    public static final Integer UNKNOWN = -1;
    /**
     * 投票通过
     */
    public static final Integer APPROVED = 1;
    /**
     * 投票未通过
     */
    public static final Integer UNAPPROVED = 2;

    /**
     * 举报任务投票ID
     */
    private Long id;

    /**
     * 评审员ID
     */
    private Long reviewerId;

    /**
     *举报任务ID
     */
    private Long reportTaskId;

    /**
     * 投票结果
     */
    private Integer voteResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getReportTaskId() {
        return reportTaskId;
    }

    public void setReportTaskId(Long reportTaskId) {
        this.reportTaskId = reportTaskId;
    }

    public Integer getVoteResult() {
        return voteResult;
    }

    public void setVoteResult(Integer voteResult) {
        this.voteResult = voteResult;
    }
}

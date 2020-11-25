package com.hr.c2c.social.govern.reviewer.domain;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @program: c2c-social-govern
 * @description: 评审员执行任务的状态
 * @author: huangrui
 * @create: 2020-11-24 16:55
 **/

public class ReviewerTaskStatus {

    /**
     * 处理中
     */
    public static final Integer PROCESSING = 1;

    /**
     * 处理完成
     */
    public static final Integer FINISHED = 2;

    /**
     * 评审员任务执行状态ID
     */
    private Long id;

    /**
     *评审员ID
     */
    private Long reviewerId;

    /**
     * 举报任务ID
     */
    private Long reportTaskId;

    /**
     * 评审员处理举报任务状态
     */
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

package com.hr.c2c.social.govern.report.domain;

/**
 * @program: c2c-social-govern
 * @description: 举报任务
 * @author: huangrui
 * @create: 2020-11-24 11:09
 **/

public class ReportTask {

    /**
     * 举报任务ID
     */
    private Long id;

    /**
     * 举报任务类型
     */
    private String type;

    /**
     * 举报用户ID
     */
    private Long reportUserId;

    /**
     * 举报说明
     */
    private String reportContent;

    /**
     * 举报对象ID
     */
    private Long targetId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Long reportUserId) {
        this.reportUserId = reportUserId;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }
}

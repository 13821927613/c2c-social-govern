package com.hr.c2c.social.govern.reviewer.dao;

import com.hr.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;

/**
 * @program: c2c-social-govern
 * @description: 评审员处理任务状态DAO接口
 * @author: huangrui
 * @create: 2020-11-25 15:53
 **/

public interface ReviewerTaskStatusDao {

    /**
     *增加评审处理任务状态
     * @param reviewerTaskStatus 评审处理任务状态
     */
    void add(ReviewerTaskStatus reviewerTaskStatus);
}

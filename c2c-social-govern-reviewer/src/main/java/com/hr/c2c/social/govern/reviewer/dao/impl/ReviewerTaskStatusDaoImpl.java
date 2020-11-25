package com.hr.c2c.social.govern.reviewer.dao.impl;

import com.hr.c2c.social.govern.reviewer.dao.ReviewerTaskStatusDao;
import com.hr.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;
import com.hr.c2c.social.govern.reviewer.mapper.ReviewerTaskStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @program: c2c-social-govern
 * @description: 评审员处理任务状态DAO接口实现类
 * @author: huangrui
 * @create: 2020-11-25 15:55
 **/

@Repository
public class ReviewerTaskStatusDaoImpl implements ReviewerTaskStatusDao {

    @Autowired
    private ReviewerTaskStatusMapper reviewerTaskStatusMapper;

    @Override
    public void add(ReviewerTaskStatus reviewerTaskStatus) {
        reviewerTaskStatusMapper.insert(reviewerTaskStatus);
    }
}

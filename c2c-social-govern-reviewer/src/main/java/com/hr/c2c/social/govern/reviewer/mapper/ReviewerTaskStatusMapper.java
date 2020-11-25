package com.hr.c2c.social.govern.reviewer.mapper;

import com.hr.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @program: c2c-social-govern
 * @description: 评审员处理任务状态Mapper组件
 * @author: huangrui
 * @create: 2020-11-25 15:49
 **/

@Mapper
@Component("reviewerTaskStatusMapper")
public interface ReviewerTaskStatusMapper {

    /**
     *插入评审员处理任务状态
     * @param reviewerTaskStatus 评审员任务状态
     */
    @Insert("insert into c2c.reviewer_task_status (reviewer_id, report_task_id, status)" +
            "values (#{reviewerId}, #{reportTaskId}, #{status})")
    void insert(ReviewerTaskStatus reviewerTaskStatus);
}

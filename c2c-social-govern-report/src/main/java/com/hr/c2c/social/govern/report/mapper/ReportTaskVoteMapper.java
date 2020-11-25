package com.hr.c2c.social.govern.report.mapper;

import com.hr.c2c.social.govern.report.domain.ReportTaskVote;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @program: c2c-social-govern
 * @description: 举报任务投票SQL
 * @author: huangrui
 * @create: 2020-11-24 11:41
 **/

@Mapper
public interface ReportTaskVoteMapper {

    /**
     *插入举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    @Insert("insert into c2c.report_task_vote (reviewer_id, report_task_id, vote_status)" +
            "values (#{reviewerId}, #{reportTaskId}, #{voteResult})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    void insert(ReportTaskVote reportTaskVote);
}

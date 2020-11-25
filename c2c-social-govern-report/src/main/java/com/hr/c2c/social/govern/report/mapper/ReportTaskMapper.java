package com.hr.c2c.social.govern.report.mapper;

import com.hr.c2c.social.govern.report.domain.ReportTask;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @program: c2c-social-govern
 * @description: 举报任务SQL
 * @author: huangrui
 * @create: 2020-11-24 11:34
 **/

@Mapper
public interface ReportTaskMapper {

    /**
     * 插入举报任务
     * @param reportTask 举报任务
     */
    @Insert("insert into c2c.report_task (type, report_user_id, report_content, target_id)" +
            "values(#{type}, #{reportUserId}, #{reportContent}, #{targetId})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    void insert(ReportTask reportTask);
}

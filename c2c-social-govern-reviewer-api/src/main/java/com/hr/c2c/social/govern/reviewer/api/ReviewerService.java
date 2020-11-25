package com.hr.c2c.social.govern.reviewer.api;

import java.util.List;

/**
 * @program: c2c-social-govern
 * @description: 评审员服务的接口
 * @author: huangrui
 * @create: 2020-11-23 11:54
 **/

public interface ReviewerService {

    /**
     * 测试
     * @param str 测试字符串
     * @return 测试
     */
    String reviewerTest(String str);

    /**
     *选择评审员
     * @param reportTaskId 举报任务id
     * @return 评审员id
     */
    List<Long> selectReviewers(Long reportTaskId);
}

package com.hr.c2c.social.govern.reviewer.api;

import java.util.List;

/**
 * @program: c2c-social-govern
 * @description: ����Ա����Ľӿ�
 * @author: huangrui
 * @create: 2020-11-23 11:54
 **/

public interface ReviewerService {

    /**
     * ����
     * @param str �����ַ���
     * @return ����
     */
    String reviewerTest(String str);

    /**
     *ѡ������Ա
     * @param reportTaskId �ٱ�����id
     * @return ����Աid
     */
    List<Long> selectReviewers(Long reportTaskId);
}

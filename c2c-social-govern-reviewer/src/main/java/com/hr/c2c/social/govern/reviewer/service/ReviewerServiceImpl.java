package com.hr.c2c.social.govern.reviewer.service;

import com.hr.c2c.social.govern.reviewer.api.ReviewerService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: c2c-social-govern
 * @description: 评审员服务的接口实现类
 * @author: huangrui
 * @create: 2020-11-23 15:27
 **/

@Service(
        version = "1.0.0",
        interfaceClass = ReviewerService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class ReviewerServiceImpl implements ReviewerService{
}

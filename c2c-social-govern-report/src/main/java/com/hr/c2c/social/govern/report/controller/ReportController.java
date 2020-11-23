package com.hr.c2c.social.govern.report.controller;

import com.hr.c2c.social.govern.reviewer.api.ReviewerService;
import com.hr.c2c.social.govern.reward.api.RewardService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: c2c-social-govern
 * @description:
 * @author: huangrui
 * @create: 2020-11-23 11:48
 **/

@RestController
public class ReportController {

    @Reference(
            version = "1.0.0",
            interfaceClass = ReviewerService.class,
            cluster ="failfast"
    )
    private ReviewerService reviewerService;

    @Reference(
            version = "1.0.0",
            interfaceClass = RewardService.class,
            cluster = "failfast"
    )
    private RewardService rewardService;
}

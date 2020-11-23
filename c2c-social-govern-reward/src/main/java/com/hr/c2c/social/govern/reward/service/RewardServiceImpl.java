package com.hr.c2c.social.govern.reward.service;

import com.hr.c2c.social.govern.reward.api.RewardService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: c2c-social-govern
 * @description:
 * @author: huangrui
 * @create: 2020-11-23 15:34
 **/

@Service(
        version = "1.0.0",
        interfaceClass = RewardService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class RewardServiceImpl implements RewardService {

    @Override
    public String rewardTest(String str) {
        return "reward test:\n\thello " + str;
    }
}

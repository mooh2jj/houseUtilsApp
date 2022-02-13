package com.dsg.houseutils.controller;

import com.dsg.houseutils.constants.ActionType;
import com.dsg.houseutils.policy.BrokerPolicy;
import com.dsg.houseutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        // TODO: 중개수수료 계산하는 로직
        BrokerPolicy policy = BrokeragePolicyFactory.of(actionType);

        return policy.calcualte(price);
    }
}

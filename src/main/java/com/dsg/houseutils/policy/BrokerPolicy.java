package com.dsg.houseutils.policy;

public interface BrokerPolicy {

    BrokerageRule createBrokerageRule(Long price);

    default Long calcualte(Long price) {
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }

}

package com.dsg.houseutils.policy;

import com.dsg.houseutils.constants.ActionType;

public class BrokeragePolicyFactory {
    public static BrokerPolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}

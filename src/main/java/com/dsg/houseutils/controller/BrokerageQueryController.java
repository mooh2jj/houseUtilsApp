package com.dsg.houseutils.controller;

import com.dsg.houseutils.constants.ActionType;
import com.dsg.houseutils.policy.BrokerPolicy;
import com.dsg.houseutils.policy.BrokeragePolicyFactory;
import com.dsg.houseutils.repository.ApartmentRepository;
import com.dsg.houseutils.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BrokerageQueryController {

    private final ApartmentService apartmentService;

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        // TODO: 중개수수료 계산하는 로직
        BrokerPolicy policy = BrokeragePolicyFactory.of(actionType);

        return policy.calcualte(price);
    }

    @GetMapping("/api/calc/apartment/{apartmentId}")
    public Long calcBrokerageByApartmentId(
            @PathVariable Long apartmentId,
            @RequestParam ActionType actionType
    ) {
        BrokerPolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calcualte(apartmentService.getPriceOrThrow(apartmentId));
    }
}

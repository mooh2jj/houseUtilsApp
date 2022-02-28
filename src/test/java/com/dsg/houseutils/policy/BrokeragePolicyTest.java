package com.dsg.houseutils.policy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BrokeragePolicyTest {

    PurchaseBrokeragePolicy purchaseBrokeragePolicy;
    RentBrokeragePolicy rentBrokeragePolicy;

    @BeforeEach
    public void setup() {
        purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();
        rentBrokeragePolicy = new RentBrokeragePolicy();
    }

    @Test
    public void testPurchaseBrokeragePolicy() {

        Assertions.assertEquals(
                purchaseBrokeragePolicy.calcualte(30_000_000L), 180_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calcualte(100_000_000L), 500_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calcualte(500_000_000L), 2_000_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calcualte(800_000_000L), 4_000_000L);
        Assertions.assertEquals(
                purchaseBrokeragePolicy.calcualte(1_000_000_000L), 9_000_000L);
    }

    @Test
    public void testRentBrokeragePolicy() {

        Assertions.assertEquals(
                rentBrokeragePolicy.calcualte(30_000_000L), 150_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calcualte(100_000_000L), 300_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calcualte(500_000_000L), 2_000_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calcualte(800_000_000L), 6_400_000L);
        Assertions.assertEquals(
                rentBrokeragePolicy.calcualte(1_000_000_000L), 8_000_000L);
    }

}

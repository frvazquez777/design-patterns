package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.frvazquez.patternsdesigns.creational.chainofresponsability.MembershipCard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    private static final int CREDITO_GOLD = 1000;
    private static final int CREDITO_PLATINUM = 50000;
    private static final int CREDITO_BLACK = 1000000;
    private static MembershipCard CARD;

    @BeforeEach
    public void setUp() {
        CARD = new MembershipCard();
    }

    @Test
    public void MembershipCardGoldtest() {
        CARD.creditCardRequest(CREDITO_GOLD);
        assertEquals("Credito Gold", CARD.getValue());
    }

    @Test
    public void MembershipCardPlatinumtest() {
        CARD.creditCardRequest(CREDITO_PLATINUM);
        assertEquals("Credito Platinum", CARD.getValue());
    }

    @Test
    public void MembershipCardBlacktest() {
        CARD.creditCardRequest(CREDITO_BLACK);
        assertEquals("Credito Black", CARD.getValue());
    }

    @AfterEach
    public void tearDown() {
        CARD = null;
    }
}

package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.frvazquez.patternsdesigns.contants.Constant;
import com.frvazquez.patternsdesigns.creational.prototype.PrototypeCard;
import com.frvazquez.patternsdesigns.creational.prototype.PrototypeFactory;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @BeforeAll
    public static void setUpClass() {
        PrototypeFactory.loadCard();
    }

    @Test
    public void prototypeVisaTest() throws CloneNotSupportedException {
        PrototypeCard prototype = PrototypeFactory.getInstance(Constant.VISA);
        assertEquals(Constant.MSG_VISA, prototype.getCard());
    }

    @Test
    public void prototypeAmexTest() throws CloneNotSupportedException {
        PrototypeCard prototype = PrototypeFactory.getInstance(Constant.AMEX);
        assertEquals(Constant.MSG_AMEX, prototype.getCard());
    }

    @AfterAll
    public static void tearDownClass() {
        PrototypeFactory.cleanCard();
    }
    
}

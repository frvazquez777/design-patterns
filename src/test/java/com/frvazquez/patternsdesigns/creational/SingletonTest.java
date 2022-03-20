package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.frvazquez.patternsdesigns.contants.Constant;
import com.frvazquez.patternsdesigns.creational.singleton.Card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {


    @Test
    @DisplayName("Singleton card | Prueba de instancia singleton")
    public void singletonCardTest() {
        Card.getInstance().setCardNumber(Constant.NUMBER_CARD_AMEX);

        assertNotNull(Card.getInstance());
        assertEquals(Constant.NUMBER_CARD_AMEX, Card.getInstance().getCardNumber());
    }

   
}

package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.frvazquez.patternsdesigns.creational.command.CreditCard;
import com.frvazquez.patternsdesigns.creational.command.CreditCardActivated;
import com.frvazquez.patternsdesigns.creational.command.CreditCardDesactive;
import com.frvazquez.patternsdesigns.creational.command.CreditCardInvoker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandTest {

    CreditCardInvoker command;

    @BeforeEach
    public void setUp() {
        command = new CreditCardInvoker();
    }

    @AfterEach
    public void tearDown() {
        command = null;
    }

    @Test
    @DisplayName("Activacion de tarjeta ;)")
    public void tarjetaActivadaTest() {
        CreditCard creditCard = new CreditCard();

        command.setComand(new CreditCardActivated(creditCard));
        command.run();

        assertEquals("El numero pin ha sido enviado al cliente", creditCard.getMsgPin());

    }

    @Test
    @DisplayName("Desactivacion de tarjeta ;)")
    public void tarjetaDesactivadaTest() {
        CreditCard creditCard = new CreditCard();

        command.setComand(new CreditCardDesactive(creditCard));
        command.run();

        assertEquals("se ha desactivado la tarjeta", creditCard.getMsgDesActivated());

    }

}

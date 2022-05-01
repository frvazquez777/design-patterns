package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.frvazquez.patternsdesigns.creational.mediator.ColleageMediator;
import com.frvazquez.patternsdesigns.creational.mediator.ConcreteCollageUserOne;
import com.frvazquez.patternsdesigns.creational.mediator.ConcreteCollageUserTwo;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void mediatorTest() {
        ColleageMediator mediator = new ColleageMediator();
        ConcreteCollageUserOne userOne = new ConcreteCollageUserOne(mediator);
        ConcreteCollageUserTwo userTwo = new ConcreteCollageUserTwo(mediator);

        mediator.setUserOne(userOne);
        mediator.setUserTwo(userTwo);

        userOne.send("Hola, que tal lalo");
        userTwo.send("Nada aqui pasando mi tiempo");

        assertEquals("Mensaje recibido del usuario 2: Hola, que tal lalo", userOne.getSendMessage());
        assertEquals("Mensaje recibido del usuario 1: Nada aqui pasando mi tiempo", userTwo.getSendMessage());
    }
}

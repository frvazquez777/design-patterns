package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.frvazquez.patternsdesigns.creational.iterator.Card;
import com.frvazquez.patternsdesigns.creational.iterator.CardList;
import com.frvazquez.patternsdesigns.creational.iterator.Iterator;
import com.frvazquez.patternsdesigns.creational.iterator.List;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        Card[] cards = new Card[3];
        cards[0] = new Card("AMEX");
        cards[1] = new Card("VISA");
        cards[2] = new Card("MASTERCARD");

        List lista = new CardList(cards);

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            Card tarjeta = (Card) iterator.next();
            assertEquals(cards[iterator.position() - 1].getType(), tarjeta.getType());
        }

    }

}

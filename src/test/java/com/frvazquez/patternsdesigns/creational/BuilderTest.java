package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.frvazquez.patternsdesigns.contants.Constant;
import com.frvazquez.patternsdesigns.creational.builder.CardModel;
import com.frvazquez.patternsdesigns.creational.builder.CardModel.CardBuilder;

public class BuilderTest {

	private static final String TYPE_CARD = "VISA";
	private static final String NUMBER = Constant.NUMBER_CARD_VISA;
	private static final String NAME = "Roman";

	@Test
	public void cardBuilderTest() {
		
		CardBuilder card = new CardModel.CardBuilder(TYPE_CARD, NUMBER)
				.name(NAME)
				.expires(2030)
				.credit(true);
		
		assertEquals(Constant.NUMBER_CARD_VISA, card.build().getNumber());
		assertEquals(NAME, card.build().getName());
		assertTrue(card.build().isCredit());
	}
}

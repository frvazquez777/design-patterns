package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.frvazquez.patternsdesigns.contants.Constant;
import com.frvazquez.patternsdesigns.creational.abstractfactory.FactoryProvider;
import com.frvazquez.patternsdesigns.creational.abstractfactory.IAbstractFactory;
import com.frvazquez.patternsdesigns.creational.abstractfactory.ICard;
import com.frvazquez.patternsdesigns.creational.abstractfactory.IPaymentMethod;

@SuppressWarnings("rawtypes")
public class AbstractFactoryTest {

	@Test
	@DisplayName("Abstract Factory | Choose Card Visa ")
	public void abstractFactoryCardVisaTest() {
		IAbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
		ICard card = (ICard) abstractFactory.create("VISA");
		assertEquals("VISA", card.getCardType());
	}

	@Test
	@DisplayName("Abstract Factory | Choose Card Mastercard ")
	public void abstractFactoryCardMastercardTest() {
		IAbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
		ICard card = (ICard) abstractFactory.create("MASTERCARD");
		assertEquals("MASTERCARD", card.getCardType());
	}

	@Test
	@DisplayName("Abstract Factory | Choose PaymentMethod DEBIT ")
	public void abstractFactoryPaymentMethodTest() {
		IAbstractFactory abstractFactory = FactoryProvider.getFactory("PaymentMethod");
		IPaymentMethod payment = (IPaymentMethod) abstractFactory.create("DEBIT");
		assertEquals(Constant.DEBIT, payment.doPayment());
	}

	@Test
	@DisplayName("Abstract Factory | Choose PaymentMethod CREDIT ")
	public void abstractFactoryPaymentMethodCREDITTest() {
		IAbstractFactory abstractFactory = FactoryProvider.getFactory("PaymentMethod");
		IPaymentMethod payment = (IPaymentMethod) abstractFactory.create("CREDIT");
		assertEquals(Constant.CREDIT, payment.doPayment());
	}

}

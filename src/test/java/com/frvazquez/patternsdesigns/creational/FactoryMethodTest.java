package com.frvazquez.patternsdesigns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.frvazquez.patternsdesigns.contants.Constant;
import com.frvazquez.patternsdesigns.creational.methodfactory.ETypePayment;
import com.frvazquez.patternsdesigns.creational.methodfactory.IPayment;
import com.frvazquez.patternsdesigns.creational.methodfactory.PaymentFactoryImpl;

public class FactoryMethodTest {

	IPayment payment;

	@Test
	@DisplayName("BuildPayment - Prueba de Pago con Google Pay")
	public void buildPaymentGooglePayTest() {

		payment = PaymentFactoryImpl.buildPayment(ETypePayment.GOOGLE_PAY);

		assertEquals(Constant.GOOGLE_PAY, payment.doPayment());
	}

	@Test
	@DisplayName("BuildPayment - Prueba de Pago con PayPal")
	public void buildPaymentPayPalTest() {

		payment = PaymentFactoryImpl.buildPayment(ETypePayment.PAYPAL);

		assertEquals(Constant.PAYPAL, payment.doPayment());
	}

	@Test
	@DisplayName("BuildPayment - Prueba de Pago con tarjeta de debito/credito")
	public void buildPaymentCardPaymentTest() {

		payment = PaymentFactoryImpl.buildPayment(ETypePayment.CARD);

		assertEquals(Constant.CARD, payment.doPayment());
	}

	@Test
	@DisplayName("BuildPayment - Prueba de Pago en efectivo")
	public void buildPaymentCashPaymentTest() {

		payment = PaymentFactoryImpl.buildPayment(ETypePayment.CASH);

		assertEquals(Constant.CASH, payment.doPayment());
	}

	@AfterEach
	public void tearDown() {
		payment = null;
	}

}

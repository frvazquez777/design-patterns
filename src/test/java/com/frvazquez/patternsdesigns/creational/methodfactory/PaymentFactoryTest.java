package com.frvazquez.patternsdesigns.creational.methodfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.frvazquez.patternsdesigns.contants.Constant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class PaymentFactoryTest {

	
	Payment payment;


	@Test
	@DisplayName("BuildPayment - Prueba de Pago con Google Pay")
	public void buildPaymentGooglePayTest() {
		
		payment = PaymentFactory.buildPayment(TypePayment.GOOGLE_PAY);
		
		assertEquals(Constant.GOOGLE_PAY, payment.doPayment());
	}


	@Test
	@DisplayName("BuildPayment - Prueba de Pago con PayPal")
	public void buildPaymentPayPalTest() {
		
		payment = PaymentFactory.buildPayment(TypePayment.PAYPAL);
		
		assertEquals(Constant.PAYPAL, payment.doPayment());
	}
	

	@Test
	@DisplayName("BuildPayment - Prueba de Pago con tarjeta de debito/credito")
	public void buildPaymentCardPaymentTest() {
		
		payment = PaymentFactory.buildPayment(TypePayment.CARD);
		
		assertEquals(Constant.CARD, payment.doPayment());
	}
	

	@Test
	@DisplayName("BuildPayment - Prueba de Pago en efectivo")
	public void buildPaymentCashPaymentTest() {
		
		payment = PaymentFactory.buildPayment(TypePayment.CASH);
		
		assertEquals(Constant.CASH, payment.doPayment());
	}
	
	@AfterEach
	public void tearDown() {
		payment = null;
	}
	
}

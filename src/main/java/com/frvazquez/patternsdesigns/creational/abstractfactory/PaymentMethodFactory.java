package com.frvazquez.patternsdesigns.creational.abstractfactory;

public class PaymentMethodFactory implements IAbstractFactory<IPaymentMethod> {

	@Override
	public IPaymentMethod create(String type) {

		switch (type) {
		case "DEBIT":
			return new ModelDebit();
		case "CREDIT":
			return new ModelCredit();
		default:
			return null;
			
		}
	}

}

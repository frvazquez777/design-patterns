package com.frvazquez.patternsdesigns.creational.abstractfactory;

public class FactoryProvider {

	@SuppressWarnings("rawtypes")
	public static IAbstractFactory getFactory(String chooseFactory) {
		if("Card".equals(chooseFactory)) {
			return new CardFactoryImpl();
		} else if("PaymentMethod".equals(chooseFactory)) {
			return new PaymentMethodFactory();
		}
		return null;
	}

}

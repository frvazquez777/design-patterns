package com.frvazquez.patternsdesigns.creational.abstractfactory;

public class CardFactoryImpl implements IAbstractFactory<ICard> {

	@Override
	public ICard create(String type) {

		switch (type) {
		case "VISA":
			return new ModelVisa();
		case "MASTERCARD":
			return new ModelMastercard();
		default:
			return null;
		}
	}

}

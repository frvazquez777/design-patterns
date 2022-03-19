package com.frvazquez.patternsdesigns.creational.abstractfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class ModelMastercard implements ICard {

	@Override
	public String getCardType() {
		return Constant.MASTERCARD;
	}

	@Override
	public String getCardNumber() {
		return Constant.NUMBER_CARD_MASTERCARD;
	}

}

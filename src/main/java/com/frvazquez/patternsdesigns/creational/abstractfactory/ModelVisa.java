package com.frvazquez.patternsdesigns.creational.abstractfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class ModelVisa implements ICard {

	@Override
	public String getCardType() {
		return Constant.VISA;
	}

	@Override
	public String getCardNumber() {
		return Constant.NUMBER_CARD_VISA;
	}

}

package com.frvazquez.patternsdesigns.creational.abstractfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class ModelCredit implements IPaymentMethod {

	@Override
	public String doPayment() {
		return Constant.CREDIT;
	}

}

package com.frvazquez.patternsdesigns.creational.methodfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class CardPayment implements IPayment{

    @Override
    public String doPayment() {
        return Constant.CARD;
    }
    

}

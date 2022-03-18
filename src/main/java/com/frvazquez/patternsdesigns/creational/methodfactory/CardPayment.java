package com.frvazquez.patternsdesigns.creational.methodfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class CardPayment implements Payment{

    @Override
    public String doPayment() {
        return Constant.CARD;
    }
    

}

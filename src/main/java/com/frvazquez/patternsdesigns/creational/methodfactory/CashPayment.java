package com.frvazquez.patternsdesigns.creational.methodfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class CashPayment implements Payment{

    @Override
    public String doPayment() {
        return Constant.CASH;
    }
    
}

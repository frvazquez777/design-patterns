package com.frvazquez.patternsdesigns.creational.methodfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class GooglePay implements Payment{

    @Override
    public String doPayment() {
        return Constant.GOOGLE_PAY;
    }
    
}

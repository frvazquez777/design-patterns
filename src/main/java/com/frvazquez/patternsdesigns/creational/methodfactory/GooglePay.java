package com.frvazquez.patternsdesigns.creational.methodfactory;

import com.frvazquez.patternsdesigns.contants.Constant;

public class GooglePay implements IPayment{

    @Override
    public String doPayment() {
        return Constant.GOOGLE_PAY;
    }
    
}

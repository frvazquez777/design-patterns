package com.frvazquez.patternsdesigns.creational.methodfactory;

public class PaymentFactory {
    
    public static Payment buildPayment(TypePayment typePayment) {
        switch(typePayment) {
            case GOOGLE_PAY:
                return new GooglePay();
            case PAYPAL:
                return new Paypal();
            case CARD:
                return new CardPayment();
            default:
                return new CashPayment();
        }
    }
}

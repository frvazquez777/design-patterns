package com.frvazquez.patternsdesigns.creational.methodfactory;

public class PaymentFactoryImpl {
    
    public static IPayment buildPayment(ETypePayment typePayment) {
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

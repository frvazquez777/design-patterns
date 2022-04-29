package com.frvazquez.patternsdesigns.creational.command;

public class CreditCard extends Message {

    public void sendToNumberPinCustomer() {
        System.out.println(getMsgPin());
    }

    public void sendToSmsNumberPinActivateCustomer() {
        System.out.println(getMsgSendActivated());
    }

    public void sendActivate() {
        System.out.println(getMsgActivated());
    }

    public void sendDesactivated() {
        System.out.println(getMsgDesActivated());
    }

    public void sendToSmsNumberPinDesactivatedCustomer() {
        System.out.println(getMsgDesActivated());
    }

}

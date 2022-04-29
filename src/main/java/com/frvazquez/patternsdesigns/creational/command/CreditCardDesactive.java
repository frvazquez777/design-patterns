package com.frvazquez.patternsdesigns.creational.command;

public class CreditCardDesactive implements Command {

    CreditCard creditCard;

    public CreditCardDesactive(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.getMsgDesActivated();
        creditCard.getMsgSendDesactivated();
    }
}

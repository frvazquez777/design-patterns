package com.frvazquez.patternsdesigns.creational.command;

public class CreditCardActivated implements Command {

    CreditCard creditCard;

    public CreditCardActivated(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.getMsgPin();
        creditCard.sendActivate();
        creditCard.getMsgSendActivated();
    }

}

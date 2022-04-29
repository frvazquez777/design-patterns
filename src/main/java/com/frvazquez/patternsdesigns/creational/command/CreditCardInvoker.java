package com.frvazquez.patternsdesigns.creational.command;

public class CreditCardInvoker {

    private Command command;

    public CreditCardInvoker() {
    }

    public void setComand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}

package com.frvazquez.patternsdesigns.creational.mediator;

public class ConcreteCollageUserOne extends Colleage {

    private String sendMessage;

    public ConcreteCollageUserOne(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        this.sendMessage = "Mensaje recibido del usuario 2: " + message;
    }

    /**
     * @return String return the sendMessage
     */
    public String getSendMessage() {
        return sendMessage;
    }

}

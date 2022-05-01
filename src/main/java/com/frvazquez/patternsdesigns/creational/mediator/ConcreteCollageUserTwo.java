package com.frvazquez.patternsdesigns.creational.mediator;

public class ConcreteCollageUserTwo extends Colleage {

    private String sendMessage;

    public ConcreteCollageUserTwo(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);

    }

    @Override
    public void messageReceived(String message) {
        this.sendMessage = "Mensaje recibido del usuario 1: " + message;

    }

    /**
     * @return String return the sendMessage
     */
    public String getSendMessage() {
        return sendMessage;
    }

}

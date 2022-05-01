package com.frvazquez.patternsdesigns.creational.mediator;

public class ColleageMediator implements Mediator {

    private ConcreteCollageUserOne userOne;
    private ConcreteCollageUserTwo userTwo;

    @Override
    public void send(String message, Colleage colleage) {
        if (colleage == userOne) {
            userOne.messageReceived(message);
        } else if (colleage == userTwo) {
            userTwo.messageReceived(message);
        }
    }

    /**
     * @param userOne the userOne to set
     */
    public void setUserOne(ConcreteCollageUserOne userOne) {
        this.userOne = userOne;
    }

    /**
     * @param userTwo the userTwo to set
     */
    public void setUserTwo(ConcreteCollageUserTwo userTwo) {
        this.userTwo = userTwo;
    }

}

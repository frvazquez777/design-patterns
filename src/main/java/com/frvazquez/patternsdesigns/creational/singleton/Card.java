package com.frvazquez.patternsdesigns.creational.singleton;

public class Card {

    private static Card instance;

    private String cardNumber;

    private Card() {

    }

    public synchronized static Card getInstance() {
        if (instance == null)
            instance = new Card();

        return instance;
    }

    /**
     * @return String return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}

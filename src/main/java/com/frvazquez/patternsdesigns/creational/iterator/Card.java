package com.frvazquez.patternsdesigns.creational.iterator;

public class Card {

    private String type;

    public Card(String type) {
        this.type = type;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}

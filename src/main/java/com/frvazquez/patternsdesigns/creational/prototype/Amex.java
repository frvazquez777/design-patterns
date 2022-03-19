package com.frvazquez.patternsdesigns.creational.prototype;

import com.frvazquez.patternsdesigns.contants.Constant;

public class Amex implements PrototypeCard {

    private String name;

    @Override
    public String getCard() {
       return Constant.MSG_AMEX;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta Amex...");
        return (Amex) super.clone();
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}

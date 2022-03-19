package com.frvazquez.patternsdesigns.creational.prototype;

import java.io.Console;

import com.frvazquez.patternsdesigns.contants.Constant;

public class Visa implements PrototypeCard {

    private String name;

    @Override
    public String getCard() {
       return Constant.MSG_VISA; 
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta visa...");
        return (Visa) super.clone();
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

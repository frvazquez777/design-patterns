package com.frvazquez.patternsdesigns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import com.frvazquez.patternsdesigns.contants.Constant;

public class PrototypeFactory {

    public static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }

    public static void loadCard() {
        Visa visa = new Visa();
        visa.setName("Visa con numero "+Constant.NUMBER_CARD_VISA);
        prototypes.put(Constant.VISA, visa);

        Amex amex = new Amex();
        amex.setName("Amex con numero "+Constant.NUMBER_CARD_AMEX);
        prototypes.put(Constant.AMEX, amex);
    }

    public static void cleanCard() {
        prototypes = new HashMap<>();
    }
}

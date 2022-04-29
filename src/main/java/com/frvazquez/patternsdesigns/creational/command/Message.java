package com.frvazquez.patternsdesigns.creational.command;

public class Message {

    private String msgPin = "El numero pin ha sido enviado al cliente";
    private String msgSendActivated = "Se ha enviado el SMS con pin para activar";
    private String msgSendDesactivated = "Se ha enviado el SMS con mensaje desactivado";
    private String msgActivated = "Se ha activado la tarjeta";
    private String msgDesActivated = "se ha desactivado la tarjeta";

    /**
     * @return String return the msgPin
     */
    public String getMsgPin() {
        return msgPin;
    }

    /**
     * @return String return the msgSendActivated
     */
    public String getMsgSendActivated() {
        return msgSendActivated;
    }

    /**
     * @return String return the msgSendDesactivated
     */
    public String getMsgSendDesactivated() {
        return msgSendDesactivated;
    }

    /**
     * @return String return the msgActivated
     */
    public String getMsgActivated() {
        return msgActivated;
    }

    /**
     * @return String return the msgDesActivated
     */
    public String getMsgDesActivated() {
        return msgDesActivated;
    }

}

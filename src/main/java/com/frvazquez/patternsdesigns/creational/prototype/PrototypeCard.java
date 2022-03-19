package com.frvazquez.patternsdesigns.creational.prototype;

public interface PrototypeCard extends Cloneable {

	public String getCard();

	public PrototypeCard clone() throws CloneNotSupportedException;

}

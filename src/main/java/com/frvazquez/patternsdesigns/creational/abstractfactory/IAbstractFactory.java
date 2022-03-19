package com.frvazquez.patternsdesigns.creational.abstractfactory;

public interface IAbstractFactory<T> {

	public T create(String type);
	
}

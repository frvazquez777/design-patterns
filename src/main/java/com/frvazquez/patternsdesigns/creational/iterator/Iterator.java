package com.frvazquez.patternsdesigns.creational.iterator;

public interface Iterator {

    public boolean hasNext();

    public Object next();

    public Object currentItem();

    public int position();

}

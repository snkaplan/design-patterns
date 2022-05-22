package com.sk.observerpattern;

public class DataSource extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        // push style
        notifyObservers(value);
    }
}

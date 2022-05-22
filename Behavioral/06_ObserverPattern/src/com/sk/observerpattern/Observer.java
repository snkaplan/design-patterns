package com.sk.observerpattern;

public interface Observer {
    // push style
    void updatePush(int value);

    //pull style
    void updatePull();
}

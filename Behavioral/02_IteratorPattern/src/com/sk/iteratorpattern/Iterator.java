package com.sk.iteratorpattern;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}

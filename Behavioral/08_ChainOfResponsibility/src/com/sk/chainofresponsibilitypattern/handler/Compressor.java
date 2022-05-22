package com.sk.chainofresponsibilitypattern.handler;

import com.sk.chainofresponsibilitypattern.HttpRequest;

public class Compressor extends Handler{

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false; // False means next handler of chain should be called
    }
}

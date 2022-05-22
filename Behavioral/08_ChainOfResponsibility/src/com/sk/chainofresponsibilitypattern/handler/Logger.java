package com.sk.chainofresponsibilitypattern.handler;

import com.sk.chainofresponsibilitypattern.HttpRequest;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}

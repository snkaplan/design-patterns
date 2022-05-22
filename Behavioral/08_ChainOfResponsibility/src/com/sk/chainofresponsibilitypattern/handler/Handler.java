package com.sk.chainofresponsibilitypattern.handler;

import com.sk.chainofresponsibilitypattern.HttpRequest;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        boolean isHandled = doHandle(request);
        if(isHandled){
            return;
        }
        if(next != null){
            next.handle(request);
        }
    }

    protected abstract boolean doHandle(HttpRequest request);
}

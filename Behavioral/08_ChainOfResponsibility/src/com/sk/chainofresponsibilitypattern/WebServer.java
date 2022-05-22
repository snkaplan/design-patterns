package com.sk.chainofresponsibilitypattern;

import com.sk.chainofresponsibilitypattern.handler.Handler;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}

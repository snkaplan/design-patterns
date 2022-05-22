package com.sk.chainofresponsibilitypattern.handler;

import com.sk.chainofresponsibilitypattern.HttpRequest;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        if(isValid){
            System.out.println("Authentication success pipeline continue.");
        } else {
            System.out.println("Auth failed pipeline will be stop");
        }
        return !isValid; // False means next handler of chain should be called
    }
}

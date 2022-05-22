package com.sk.chainofresponsibilitypattern;

import com.sk.chainofresponsibilitypattern.handler.Authenticator;
import com.sk.chainofresponsibilitypattern.handler.Compressor;
import com.sk.chainofresponsibilitypattern.handler.Encryptor;
import com.sk.chainofresponsibilitypattern.handler.Logger;

public class Main {

    public static void main(String[] args) {
        // auth -> log -> compressor -> encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}

package com.sk.facadepattern;

import com.sk.facadepattern.notification.NotificationService;

public class Main {

    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello World", "target");
    }
}

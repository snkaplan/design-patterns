package com.sk.facadepattern.notification;

import com.sk.facadepattern.notification.AuthToken;
import com.sk.facadepattern.notification.Message;
import com.sk.facadepattern.notification.NotificationServer;

public class NotificationService {
    public void send(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        AuthToken token = server.authenticate("appId", "key");
        server.send(token, new Message(message), target);
        connection.disconnect();
    }
}

package org.acme.domain;


public interface MessageSender {

    void sendMessage(String message);

    void close();
}

package org.acme.service;

import org.acme.domain.MessageSender;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class MessageService {


    private final MessageSender messageSender;

    @Inject
    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }


    public void sendMessage(String message) {
        messageSender.sendMessage(message);
    }
}

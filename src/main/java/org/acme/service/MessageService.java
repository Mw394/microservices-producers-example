package org.acme.service;

import org.acme.domain.MessageSender;
import org.acme.domain.SomeAwesomeObject;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class MessageService {


    private final MessageSender messageSender;
    private final SomeAwesomeObject someAwesomeObject;

    @Inject
    public MessageService(MessageSender messageSender, SomeAwesomeObject someAwesomeObject) {
        this.messageSender = messageSender;
        this.someAwesomeObject = someAwesomeObject;
    }


    public void sendMessage(String message) {
        System.out.println(someAwesomeObject.getAwesomeString());
        messageSender.sendMessage(message);
    }
}

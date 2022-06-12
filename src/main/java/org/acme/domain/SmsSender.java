package org.acme.domain;

public class SmsSender implements MessageSender{

    private String prefix;

    public SmsSender(String prefix) {
        this.prefix = prefix;
    }


    @Override
    public void sendMessage(String message) {
        System.out.print(prefix + " " + message);
    }
}

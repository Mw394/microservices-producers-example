package org.acme.domain;

public class EmailSender implements MessageSender{

    private String prefix;

    public EmailSender(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void sendMessage(String message) {
        System.out.print(prefix + " " + message);
    }

    @Override
    public void close() {

    }
}

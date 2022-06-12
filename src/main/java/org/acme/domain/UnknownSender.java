package org.acme.domain;

public class UnknownSender implements MessageSender{

    private String prefix;

    public UnknownSender(String prefix) {
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

package org.acme.producers;
import io.vertx.core.http.HttpServerRequest;
import org.acme.domain.EmailSender;
import org.acme.domain.MessageSender;
import org.acme.domain.SmsSender;
import org.acme.domain.UnknownSender;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Produces;



public class MessageSenderProducer {

    @Inject
    HttpServerRequest request;
    /*
    This method will return the correct type of messageSender based on the request header "message-type"
     */
    @Produces
    @RequestScoped
    MessageSender createMessageSender() {
        System.out.println("PRODUCES");
        String messageType = request.getHeader("message-type");
        if (messageType == null || messageType.isEmpty()) {
            return new UnknownSender("UNKNOWN");
        } else if (messageType.equals("sms")) {
            return new SmsSender("SMS");
        } else if (messageType.equals("email")) {
            return new EmailSender("EMAIL");
        } else {
            return new UnknownSender("UNKNOWN");
        }
    }
}

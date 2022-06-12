package org.acme.producers;

import io.vertx.core.http.HttpServerRequest;
import org.acme.domain.SomeAwesomeObject;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Produces;

@ApplicationScoped
public class SomeAwesomeObjectProducer {

    @Produces
    @RequestScoped
    SomeAwesomeObject createSomeAwesomeObject() {
        return new SomeAwesomeObject("I'm an awesome object");
    }
}

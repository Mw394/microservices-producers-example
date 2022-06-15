package org.acme.resource.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {

    private String message;

    public MessageDTO(@JsonProperty("message") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

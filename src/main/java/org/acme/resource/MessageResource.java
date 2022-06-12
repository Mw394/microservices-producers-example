package org.acme.resource;

import org.acme.resource.DTO.MessageDTO;
import org.acme.service.MessageService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/message")
@Dependent
public class MessageResource {


    private final MessageService messageService;

    @Inject
    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @POST
    public void postMessage(MessageDTO messageDTO) {
        messageService.sendMessage(messageDTO.getMessage());
    }


}

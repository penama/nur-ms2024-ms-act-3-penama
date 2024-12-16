package com.service.catering.infraestructure.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

public class CommandEntitysEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCommandEntitysEvent( final Object data ){
        CommandEntitysEvent commandEntitysEvent = new CommandEntitysEvent( this, data );
        applicationEventPublisher.publishEvent( commandEntitysEvent );
    }

}

package com.service.catering.infraestructure.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class CommandEntitysEvent extends ApplicationEvent {

    private Object data;

    public CommandEntitysEvent(Object source, Object data) {
        super(source);
        this.data = this.data;
    }

}

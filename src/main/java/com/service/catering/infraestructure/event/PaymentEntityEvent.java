package com.service.catering.infraestructure.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class PaymentEntityEvent extends ApplicationEvent {
    private Object data;
     public PaymentEntityEvent(Object source, Object Data) {
        super(source);
        this.data = data;
    }

}

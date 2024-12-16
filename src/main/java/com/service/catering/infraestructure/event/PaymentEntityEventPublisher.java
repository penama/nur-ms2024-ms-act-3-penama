package com.service.catering.infraestructure.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PaymentEntityEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void PaymentEntityEvent( final Object data ){
        PaymentEntityEvent paymentEntityEvent = new PaymentEntityEvent( this, data );
        applicationEventPublisher.publishEvent( paymentEntityEvent );
    }

}

package com.service.catering.infraestructure.event;

import com.service.catering.infraestructure.model.PaymentEntity;
import com.service.catering.infraestructure.repositories.PaymentServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CommandEntitysEventListener implements ApplicationListener<CommandEntitysEvent> {

    @Autowired
    private PaymentServiceRepository paymentServiceRepository;

        @Override
    public void onApplicationEvent(CommandEntitysEvent event) {
        if ( event.getData() instanceof PaymentEntity) {
            try {
                paymentServiceRepository.newPaid( (PaymentEntity)event.getData() );
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}

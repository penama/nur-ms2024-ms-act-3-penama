package com.service.catering.infraestructure.repositories;

import com.service.catering.infraestructure.model.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceRepository {

    @Autowired
    public  PaymentRepository repository;

    public void newPaid( PaymentEntity paymentEntity ) throws Exception{
        System.out.println( "entro PaymentEntity" );
        paymentEntity.setId(UUID.randomUUID().toString());
        paymentEntity.setCreatedDate( "hoy" );
        repository.save(paymentEntity);
    }

//    @EventHandler
//    public void newPago(PaymentEvent pe){
//        PaymentEntity payment = new PaymentEntity( pe.getId(), pe.getCreatedDate(), pe.getPaymentMethodId(), pe.getInvoiceId(), pe.getStatus(), pe.getMonto(), pe.getMoneda() );
//        repository.save( payment );
//    }

//    @QueryHandler
//    public List<PaymentEntity> handle(PaymentQuery paymentQuery){
//        return repository.findAll();
//    }


}

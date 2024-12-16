package com.service.catering.application.service;

//import com.service.catering.application.event.PaymentQuery;
import com.service.catering.application.model.payment.*;
import com.service.catering.application.utils.PaymentUtil;
import com.service.catering.infraestructure.event.CommandEntitysEvent;
//import com.service.catering.infraestructure.model.PaymentEntity;
//import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;

@Service
public class PaymentService {

//    @Autowired
//    private CommandGateway commandGateway;
//    @Autowired
//    private QueryGateway queryGateway;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    public void newPago(PaymentDto paymentDto) throws Exception {
//        PaymentCommand paymentCommand = new PaymentCommand("2342", "hoy",
//                PaymentStatus.PAID.name(),
//                paymentDto.getInvoice().getInvoiceId(),
//                paymentDto.getPaymentMethod().getPaymentMethodId(),
//                paymentDto.getPrice().getAmount(),
//                paymentDto.getPrice().getCurrency());
//        commandGateway.sendAndWait(paymentCommand);

        CommandEntitysEvent commandEntitysEvent = new CommandEntitysEvent( this, PaymentUtil.paymentDtoToPaymentEntity( paymentDto ));
        applicationEventPublisher.publishEvent( commandEntitysEvent );

    }

    public List<PaymentDto> getPagos() throws Exception {

//
//        CompletableFuture<List<PaymentEntity>> cPaymentEntities = queryGateway.query(new PaymentQuery(), ResponseTypes.multipleInstancesOf(PaymentEntity.class));
//        if (!cPaymentEntities.isDone())
//            new ResponseEntity(HttpStatus.NOT_FOUND);
//        List<PaymentDto> paymentDtos = new ArrayList<>();
//        List<PaymentEntity> paymentEntities = null;
//        try {
//            paymentEntities = cPaymentEntities.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        for (PaymentEntity paymentEntity : paymentEntities) {
//            PaymentDto paymentDto = new PaymentDto();
//            paymentDto.setId(paymentEntity.getId());
//            paymentDto.setCreatedDate(paymentEntity.getCreatedDate());
//            paymentDto.setStatus(paymentEntity.getStatus());
//            Invoice invoice = new Invoice();
//            invoice.setInvoiceId(paymentEntity.getInvoiceId());
//            paymentDto.setInvoice(invoice);
//            PaymentMethod paymentMethod = new PaymentMethod();
//            paymentMethod.setPaymentMethodId(paymentEntity.getPaymentMethodId());
//            paymentDto.setPaymentMethod(paymentMethod);
//            Price price = new Price();
//            price.setCurrency(paymentEntity.getCurrency());
//            price.setAmount(paymentEntity.getAmount());
//            paymentDto.setPrice(price);
//            paymentDtos.add(paymentDto);
//        }
//        return paymentDtos;

        return new ArrayList<>();
    }

}

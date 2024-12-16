package com.service.catering.domain.model;

import com.service.catering.application.event.PaymentCommand;
import com.service.catering.application.event.PaymentEvent;
import lombok.Data;
//import org.axonframework.commandhandling.CommandHandler;
//import org.axonframework.modelling.command.AggregateIdentifier;
//import org.axonframework.spring.stereotype.Aggregate;
//import static org.axonframework.modelling.command.AggregateLifecycle.apply;

import java.util.Date;

@Data
//@Aggregate
public class PaymentModel {

//    @AggregateIdentifier
    private String id;
    private Date createdDate;
    private String status;
    private String invoiceId;
    private String paymentMethodId;
    private float monto;
    private String moneda;

//    @CommandHandler
    public void newPago(PaymentCommand paymentComand){
        if ( paymentComand == null ) throw new RuntimeException("Payment is null");
//        apply( new PaymentEvent(
//                paymentComand.getId(),
//                paymentComand.getCreatedDate(),
//                paymentComand.getStatus(),
//                paymentComand.getInvoiceId(),
//                paymentComand.getPaymentMethodId(),
//                paymentComand.getAmount(),
//                paymentComand.getCurrency())
//        );
    }


}

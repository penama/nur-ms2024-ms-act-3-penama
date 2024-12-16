package com.service.catering.application.event;

import lombok.AllArgsConstructor;
import lombok.Data;
//import org.axonframework.modelling.command.AggregateIdentifier;
//import org.axonframework.modelling.command.TargetAggregateIdentifier;
//import org.axonframework.spring.stereotype.Aggregate;

import java.util.Date;

@Data
public class PaymentCommand {

//    @TargetAggregateIdentifier
    public String id;
    public String createdDate;
    public String status;
    public String invoiceId;
    public String paymentMethodId;
    public float amount;
    public String currency;

    public PaymentCommand(){

    }
    public PaymentCommand( String id, String createDate, String status, String invoiceId, String paymentMethodId, float amount, String currency ){
        this.id = id;
        this.createdDate = createDate;
        this.status = status;
        this.invoiceId = invoiceId;
        this.paymentMethodId = paymentMethodId;
        this.amount = amount;
        this.currency = currency;
    }


}

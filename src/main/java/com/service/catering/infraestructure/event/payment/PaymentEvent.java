package com.service.catering.infraestructure.event.payment;

import com.service.catering.application.model.payment.Customer;
import com.service.catering.application.model.payment.Price;
import lombok.Data;

@Data
public class PaymentEvent {

    private String id;
    private String createdDate;
    private String status;
//    private Invoice invoice;
    private PaymentMethodEvent paymentMethodEvent;
    private Price price;
    private Customer customer;

}

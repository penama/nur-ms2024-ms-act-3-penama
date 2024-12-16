package com.service.catering.application.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PaymentEvent {

    private String id;
    private String createdDate;
    private String status;
    private String invoiceId;
    private String paymentMethodId;
    private float monto;
    private String moneda;

}

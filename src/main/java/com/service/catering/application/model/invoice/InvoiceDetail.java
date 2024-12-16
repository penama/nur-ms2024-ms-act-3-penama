package com.service.catering.application.model.invoice;

import lombok.Getter;

@Getter
public class InvoiceDetail {

    public String id;
    public String code;
    public float amount;
    public String concepts;
    public String description;
    public float  unitPrice;
    public float  discount;
    public float  subtotal;
    public String currency;

}

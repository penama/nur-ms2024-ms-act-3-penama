package com.service.catering.infraestructure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity( name = "Payment")
@Data
public class PaymentEntity {

    @Id
    public String id;
    public String createdDate;
    public String status;
//    public String invoiceId;

    @ManyToOne
    @JoinColumn(name = "paymentMethodId", referencedColumnName = "id")
    private PaymentMethodEntity paymentMethodEntity;

    public float amount;
    public String currency;

}

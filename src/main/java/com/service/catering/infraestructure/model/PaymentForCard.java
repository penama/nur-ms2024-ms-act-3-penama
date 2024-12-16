package com.service.catering.infraestructure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "PaymentForCard")
public class PaymentForCard {

    @Id
    private String id;
    private String transaction;
    private String fecha;
    private String status;

    @ManyToOne
    @JoinColumn(name = "paymentId", referencedColumnName = "id")
    private PaymentEntity paymentEntity;

}

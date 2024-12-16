package com.service.catering.infraestructure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Data
@Entity(name = "PaymentMethod")
public class PaymentMethodEntity {

    @Id
    public String id;
    public String name;
    public String label;
    public String descripcion;
    public String type;
    public String status;

}

package com.service.catering.application.model.paymentmethod;

import lombok.Getter;

@Getter
public class PaymentMethodDto {

    private String id;
    private String name;
    private String label;
    private String description;

    public void setName( String name ){
        if ( name == null || name.trim().isEmpty() )
            throw new RuntimeException( "Field is null o Empty..." );
        this.name = name;
    }

    public void setLabel( String label ){
        if ( label == null || label.isEmpty() )
            throw new RuntimeException( "Field is null o Empty..." );
        this.label = label;
    }

    public void setDescription( String description ){
        if ( description == null || description.isEmpty() )
            throw new RuntimeException( "Field is null o Empty..." );
        this.description = description;
    }

}

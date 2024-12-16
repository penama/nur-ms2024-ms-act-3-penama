package com.service.catering.application.utils;

import com.service.catering.application.model.payment.PaymentDto;
import com.service.catering.infraestructure.model.PaymentEntity;
import com.service.catering.infraestructure.model.PaymentMethodEntity;

public class PaymentUtil {

    public static PaymentEntity paymentDtoToPaymentEntity(PaymentDto paymentDto){
        PaymentEntity paymentEntity = new PaymentEntity();
//        paymentEntity.setId( "" );
//        paymentEntity.setCreatedDate( "" );
        PaymentMethodEntity paymentMethodEntity = new PaymentMethodEntity();
        paymentMethodEntity.setId(paymentDto.getId() );
        paymentEntity.setPaymentMethodEntity( paymentMethodEntity );
//        paymentEntity.setStatus( "" );
        paymentEntity.setCurrency( paymentDto.getPrice().getCurrency() );
        paymentEntity.setAmount( paymentDto.getPrice().getAmount() );
        return paymentEntity;
    }

}

package com.service.catering.application.service.interfaces;

import com.service.catering.application.model.payment.PaymentDto;

public interface IOrderServiceUpdateStatus {

    public void actualizarStatus(String orderId)  throws  Exception;

}

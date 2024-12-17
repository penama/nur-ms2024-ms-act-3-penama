package com.service.catering.application.service;

import com.service.catering.application.model.payment.*;
import com.service.catering.application.service.interfaces.IOrderServiceUpdateStatus;
import com.service.catering.application.utils.PaymentUtil;
import com.service.catering.domain.model.PaymentEntity;
import com.service.catering.infraestructure.event.querys.IQueryPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService extends BaseService{

    @Autowired
    private IQueryPaymentRepository iQueryPaymentRepository;

    @Autowired
    private IOrderServiceUpdateStatus iOrderServiceUpdateStatus;

    public void newPayment(PaymentDto paymentDto) throws Exception {
        PaymentEntity paymentEntity = PaymentUtil.paymentDtoToPaymentEntity( paymentDto );
        paymentEntity.setStatus( PaymentStatus.PAID.name() );
//        CommandEntitysEvent commandEntitysEvent = new CommandEntitysEvent( this, paymentEntity);
//        applicationEventPublisher.publishEvent( commandEntitysEvent );
        commandHandler( this, paymentEntity );
        iOrderServiceUpdateStatus.actualizarStatus( paymentEntity.getOrderId() );
    }

    public List<PaymentDto> getPayments() throws Exception {
        List<PaymentEntity> paymentEntities = iQueryPaymentRepository.queryPayment();
        List<PaymentDto> paymentDtos = new ArrayList<>();
        for (PaymentEntity paymentEntity : paymentEntities) {
            paymentDtos.add( PaymentUtil.paymentEntityToPaymentDto( paymentEntity ) );
        }
        return paymentDtos;
    }

    public List<PaymentDto> getPaymentsByOrderId( String orderId ) throws Exception {
        List<PaymentEntity> paymentEntities = iQueryPaymentRepository.queryPaymentsByOrderId( orderId );
        List<PaymentDto> paymentDtos = new ArrayList<>();
        for (PaymentEntity paymentEntity : paymentEntities) {
            paymentDtos.add( PaymentUtil.paymentEntityToPaymentDto( paymentEntity ) );
        }
        return paymentDtos;
    }

}

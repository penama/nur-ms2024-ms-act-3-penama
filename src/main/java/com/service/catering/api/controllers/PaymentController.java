package com.service.catering.api.controllers;

import com.service.catering.application.model.payment.PaymentDto;
import com.service.catering.application.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/v1/catering" )
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping( "/payment" )
    public ResponseEntity pagar(@RequestBody PaymentDto paymentDto){
        try {
            paymentService.newPago( paymentDto );
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping( "/payments" )
    public ResponseEntity<List<PaymentDto>> getPagos(){
        List<PaymentDto> paymentDtos = null;
        try {
            paymentDtos = paymentService.getPagos();
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<PaymentDto>>(paymentDtos, HttpStatus.OK);
    }

}
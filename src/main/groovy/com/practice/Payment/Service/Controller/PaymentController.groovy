package com.practice.Payment.Service.Controller

import com.practice.Payment.Service.Entity.Payment
import com.practice.Payment.Service.Repo.PaymentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = "/payments")
class PaymentController {

    @Autowired
    PaymentRepo paymentRepo

    @Autowired
    Environment environment

    @PostMapping('/addPayment')
    ResponseEntity<Payment> addPayment(@RequestBody Payment payment) {
        System.out.println(environment.getProperty('server.port'))
        new ResponseEntity<Payment>(paymentRepo.save(payment), HttpStatus.CREATED)
    }
}

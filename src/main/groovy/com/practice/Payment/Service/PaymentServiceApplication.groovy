package com.practice.Payment.Service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class PaymentServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication, args)
	}

}

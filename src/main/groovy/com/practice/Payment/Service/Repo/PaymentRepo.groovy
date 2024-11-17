package com.practice.Payment.Service.Repo

import com.practice.Payment.Service.Entity.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepo extends JpaRepository<Payment, Long>{

}
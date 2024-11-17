package com.practice.Payment.Service.Entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column
    Double itemCost

    @Column
    String itemName
}

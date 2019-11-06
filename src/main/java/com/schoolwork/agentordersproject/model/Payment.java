package com.schoolwork.crudyrestaurants.amodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    private long paymentid;

    private String type;
}

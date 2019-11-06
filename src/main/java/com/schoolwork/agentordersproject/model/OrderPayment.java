package com.schoolwork.crudyrestaurants.amodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jointable")
public class OrderPayment {

    private long ordernum;
    private long paymentid;
}

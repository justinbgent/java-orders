package com.schoolwork.crudyrestaurants.amodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private long ordnum;

    @Column
    private double ordamount;
    private double advanceamount;
    private String orderdescription;

    private long custcode;

}

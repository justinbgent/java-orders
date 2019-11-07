package com.schoolwork.crudyrestaurants.amodel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ordnum;

    @Column
    private double ordamount;
    private double advanceamount;
    private String orderdescription;

    @OneToMany
    @NotNull
    private long custcode;

}

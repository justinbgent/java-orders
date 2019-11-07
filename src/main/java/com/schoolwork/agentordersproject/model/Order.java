package com.schoolwork.agentordersproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ordnum;

    @Column(nullable = true)
    private double ordamount;
    private double advanceamount;
    private String orderdescription;
    //private long custcode;

    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customer customer;

    public Order() { }

    public Order(double ordamount, double advanceamount, String orderdescription) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum() { return ordnum; }

    public void setOrdnum(long ordnum) { this.ordnum = ordnum; }

    public double getOrdamount() { return ordamount; }

    public void setOrdamount(double ordamount) { this.ordamount = ordamount; }

    public double getAdvanceamount() { return advanceamount; }

    public void setAdvanceamount(double advanceamount) { this.advanceamount = advanceamount; }

    public String getOrderdescription() { return orderdescription; }

    public void setOrderdescription(String orderdescription) { this.orderdescription = orderdescription; }

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
}

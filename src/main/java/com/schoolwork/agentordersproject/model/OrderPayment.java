package com.schoolwork.agentordersproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jointable")
public class OrderPayment {

    private long ordernum;
    private long paymentid;

    public OrderPayment() { }

    public OrderPayment(long ordernum, long paymentid) {
        this.ordernum = ordernum;
        this.paymentid = paymentid;
    }

    public long getOrdernum() { return ordernum; }

    public void setOrdernum(long ordernum) { this.ordernum = ordernum; }

    public long getPaymentid() { return paymentid; }

    public void setPaymentid(long paymentid) { this.paymentid = paymentid; }
}

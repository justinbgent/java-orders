package com.schoolwork.crudyrestaurants.amodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agents")
public class Agent {
    @Id
    private long agentcode;

    @Column
    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;
}

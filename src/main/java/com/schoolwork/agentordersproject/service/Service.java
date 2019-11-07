package com.schoolwork.agentordersproject.service;

import com.schoolwork.agentordersproject.model.Agent;
import com.schoolwork.agentordersproject.model.Customer;
import com.schoolwork.agentordersproject.model.Order;

import java.util.List;

public interface Service {
    List<Customer> getCustomers();

    Customer getCustomerById(long id);

    List<Customer> getCustomerLikeName(String likename);

    Agent getAgentById(long id);

    Order getOrderById(long id);
}

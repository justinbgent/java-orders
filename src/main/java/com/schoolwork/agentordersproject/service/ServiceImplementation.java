package com.schoolwork.agentordersproject.service;

import com.schoolwork.agentordersproject.model.Agent;
import com.schoolwork.agentordersproject.model.Customer;
import com.schoolwork.agentordersproject.model.Order;
import com.schoolwork.agentordersproject.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "service")
public class ServiceImplementation implements com.schoolwork.agentordersproject.service.Service {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(long id) {
        return null;
    }

    @Override
    public List<Customer> getCustomerLikeName(String likename) {
        return null;
    }

    @Override
    public Agent getAgentById(long id) {
        return null;
    }

    @Override
    public Order getOrderById(long id) {
        return null;
    }
}

package com.schoolwork.agentordersproject.repos;

import com.schoolwork.agentordersproject.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}

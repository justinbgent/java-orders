package com.schoolwork.agentordersproject.repos;

import com.schoolwork.agentordersproject.model.OrderPayment;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepoPaymentsJoinRepo extends CrudRepository<OrderPayment, Long> {
}

package com.simpledemos.deposits.api.repository;

import com.simpledemos.deposits.api.models.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}

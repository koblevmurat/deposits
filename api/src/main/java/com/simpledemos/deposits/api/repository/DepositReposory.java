package com.simpledemos.deposits.api.repository;

import com.simpledemos.deposits.api.models.DepositEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositReposory extends JpaRepository<DepositEntity, Integer> {
}

package com.simpledemos.deposits.api.service;

import com.simpledemos.deposits.api.dto.DepositDto;

public interface DepositService {
    DepositDto createDeposit(DepositDto depositDto);
}

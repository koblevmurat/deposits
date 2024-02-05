package com.simpledemos.deposits.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DepositDto {
    private int id;
    //    private DepositTypeEntity depositType;
//    private CustomerEntity customer;
    private Date openingDate;
}

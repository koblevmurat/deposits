package com.simpledemos.deposits.api.service.impl;

import com.simpledemos.deposits.api.dto.CustomerDto;
import com.simpledemos.deposits.api.models.CustomerEntity;
import com.simpledemos.deposits.api.repository.CustomerRepository;
import com.simpledemos.deposits.api.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService  {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        CustomerEntity customer = new CustomerEntity();
        customer.setFullName(customerDto.getFullName());
        customer.setName(customerDto.getName());

        CustomerEntity newCustomer = customerRepository.save(customer);
        CustomerDto customerResponse = new CustomerDto();
        customerResponse.setId(newCustomer.getId());
        customerResponse.setName(newCustomer.getName());
        customerResponse.setFullName(newCustomer.getFullName());

        return  customerResponse;
    }
}

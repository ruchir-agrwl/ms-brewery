package com.learn.brewery.services;

import com.learn.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID custId) {
        return CustomerDto.builder()
                .customerId(custId)
                .firstName("Rajesh")
                .lastName("A V")
                .build();
    }
}

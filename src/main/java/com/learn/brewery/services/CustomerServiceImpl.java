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

    @Override
    public CustomerDto saveCustomerDto(CustomerDto customerDto) {
        System.out.println("Saving Customer Object");
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .firstName("Manu")
                .build();
    }

    @Override
    public CustomerDto updateCustomerDto(UUID custId, CustomerDto customerDto) {
        System.out.println("Updating Customer Dto");
        return CustomerDto.builder()
                .customerId(custId)
                .build();
    }

    @Override
    public void deleteCustomerDto(UUID custId) {
        System.out.println("Deleting the customer of cust id => "+custId);
    }
}

package com.learn.brewery.services;

import com.learn.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID custId);
}

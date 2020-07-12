package com.learn.brewery.controller;

import com.learn.brewery.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cust")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping({"/{custId}"})
    public ResponseEntity getCustomerById(@PathVariable UUID custId){
        return new ResponseEntity(customerService.getCustomerById(custId), HttpStatus.OK);
    }

    //TODO Create Post, Put and Delete Objects for Customer
}

package com.learn.brewery.controller;

import com.learn.brewery.services.CustomerService;
import com.learn.brewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity saveCustomerDto(@RequestBody  CustomerDto customerDto){
        customerService.saveCustomerDto(customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping({"/{custId}"})
    public ResponseEntity updateCustomerDto(@PathVariable UUID custId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomerDto(custId,customerDto);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping({"/{custId}"})
    public ResponseEntity deleteCustomerDto(@PathVariable UUID custId){
        customerService.deleteCustomerDto(custId);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}

package com.ntonsite.apigateway.controller;

import com.ntonsite.apigateway.entity.Customer;
import com.ntonsite.apigateway.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nmwamlima on Oct, 2020
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/api/v1/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
}

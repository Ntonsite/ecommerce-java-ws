package com.ntonsite.apigateway.service;

import com.ntonsite.apigateway.entity.Customer;
import com.ntonsite.apigateway.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nmwamlima on Oct, 2020
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}

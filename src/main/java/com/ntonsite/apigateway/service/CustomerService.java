package com.ntonsite.apigateway.service;

import com.ntonsite.apigateway.dto.OrderRequest;
import com.ntonsite.apigateway.entity.Customer;
import com.ntonsite.apigateway.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Customer placeOrder(OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    public List<Customer> ordersList(){
        return customerRepository.findAll();
    }

}

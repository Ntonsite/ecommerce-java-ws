package com.ntonsite.apigateway.controller;

import com.ntonsite.apigateway.dto.OrderRequest;
import com.ntonsite.apigateway.entity.Customer;
import com.ntonsite.apigateway.service.CustomerService;
import com.ntonsite.apigateway.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nmwamlima on Oct, 2020
 */

@RestController
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;


    @PostMapping("/api/v1/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerService.placeOrder(request);
    }

    @GetMapping("/api/v1/listOrders")
    public List<Customer> ordersList(){
        return customerService.ordersList();
    }
}

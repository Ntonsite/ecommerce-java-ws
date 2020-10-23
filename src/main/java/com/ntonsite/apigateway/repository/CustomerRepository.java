package com.ntonsite.apigateway.repository;

import com.ntonsite.apigateway.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nmwamlima on Oct, 2020
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findCustomerByName(String name);
}

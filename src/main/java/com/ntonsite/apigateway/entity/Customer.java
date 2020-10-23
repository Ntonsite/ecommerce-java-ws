package com.ntonsite.apigateway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nmwamlima on Oct, 2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int phone;
    private String location;
}

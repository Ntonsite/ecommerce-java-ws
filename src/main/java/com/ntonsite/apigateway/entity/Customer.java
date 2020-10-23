package com.ntonsite.apigateway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private int c_id;
    private String name;
    private int phone;
    private String location;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "c_id")
    private List<Product> products;
}

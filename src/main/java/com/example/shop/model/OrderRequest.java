package com.example.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;

/**
 * Represents a request to create an order.
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private String name;
    private String email;
    private String mobileNo;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String paymentType;
}

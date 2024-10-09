package com.example.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * Represents a request to create an order.
 */

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

    @Override
    public String toString() {
        return "OrderRequest {" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}

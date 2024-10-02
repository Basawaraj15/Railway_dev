package com.example.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class OrderAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String mobileNo;
    private String address;
    private String city;
    private String state;
    private String pincode;

    // Lombok @Data will handle getters, setters, toString, equals, and hashCode

    // Constructor
    public OrderAddress(Integer id, String name, String email, String mobileNo, String address, 
                        String city, String state, String pincode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}


package com.example.shop.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderRequest {

    private String name;
    private String email;
    private String mobileNo;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String paymentType;

    // Lombok @Data will handle getters, setters, and toString automatically

  
    @Override
	public String toString() {
		return "OrderRequest [Name=" + Name +  ", email=" + email + ", mobileNo="
				+ mobileNo + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", paymentType=" + paymentType + "]";
	}
}


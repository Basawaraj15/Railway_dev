package com.example.shop.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class OrderRequest {

	private String Name;

	

	private String email;

	private String mobileNo;

	private String address;

	private String city;

	private String state;

	private String pincode;
	
	private String paymentType;

	public String getFirstName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}

	

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "OrderRequest [Name=" + Name +  ", email=" + email + ", mobileNo="
				+ mobileNo + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", paymentType=" + paymentType + "]";
	}

	public OrderRequest(String Name, String email, String mobileNo, String address, String city,
			String state, String pincode, String paymentType) {
		super();
		
		this.Name = Name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.paymentType = paymentType;
	}

	

	

	
}

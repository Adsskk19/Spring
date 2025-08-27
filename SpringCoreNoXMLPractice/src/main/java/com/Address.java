package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String doorNo;
	private String street;
	@Value("${zipcode}")
	private int zipcode;
	public Address() {
		
	}
	public Address(String doorNo, String street, int zipcode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.zipcode = zipcode;
	}
	public String getDoorNo() {
		return doorNo;
	}
	@Value("${doorNo}")
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	@Value("${street}")
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", zipcode=" + zipcode + "]";
	}
	
	
	

}

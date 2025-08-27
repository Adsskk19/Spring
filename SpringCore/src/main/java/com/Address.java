package com;

public class Address {
	
	private int dNo;
	
	private String street;
	public Address() {
		
	}
	public Address(int dNo, String street) {
		super();
		this.dNo = dNo;
		this.street = street;
	}

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", street=" + street + "]";
	}
	

}

package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="mycustomers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String name;

	
	public Customer() {
		
	}

	public Customer(String name) {
		super();
		this.name = name;
	
	}
	

	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}





	
	
	
	
	

}

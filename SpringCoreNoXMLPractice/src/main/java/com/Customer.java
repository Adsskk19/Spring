package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("customer")
public class Customer {
	
	private int customerId;
	private String name;
	@Autowired
	private Address addr;
	
	public Customer() {
		System.out.println("Customer bean created");
	}
	
	public Customer(int customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	
	public Customer(int customerId, String name, Address addr) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.addr = addr;
	}
	@PostConstruct
	public void dummyMethod() {
		System.out.println("Post Construct called");
	}

	public int getCustomerId() {
		return customerId;
	}
	@Value("${customerId}")
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	@Value("${name}")
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}
	
	

}

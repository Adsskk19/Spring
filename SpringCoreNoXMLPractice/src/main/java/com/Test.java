package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
	
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class) ;
	getCustomerDetails(container);
		
		SimTest simTest = container.getBean("simTest",SimTest.class);
		simTest.callSim();
		
	}

	private static void getCustomerDetails(ApplicationContext container) {
		Customer customer = container.getBean("customer",Customer.class);
		System.out.println(customer);
		System.out.println(customer.getAddr());
	}

}

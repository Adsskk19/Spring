package com;

import java.beans.Customizer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.CustomerDao;
import com.model.Customer;

public class Test {
	
	public static void main(String[] args) {
		 
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		CustomerDao customerDao = container.getBean("customerDao",CustomerDao.class);
		
		Customer customer = customerDao.getCustomer(3);
		System.out.println(customer);
		
//	customerDao.saveCustomer(new Customer("Naveen"));
//	System.out.println("data saved");
//	customerDao.updateCustomer(new Customer(4,"Abhi"));
//	System.out.println("data updated");
//		customerDao.deleteCustomer(6);
//		System.out.println("data Deleted");
		
	
		
		
	}

}

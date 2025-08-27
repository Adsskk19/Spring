package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Customer;


@Component()
@Transactional
public class CustomerDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public Session getSession() {
 		Session session = sessionFactory.getCurrentSession();
 		return session;
 	}
	
 	public Customer getCustomer(int customerId) {
 		Session session = getSession();
 		Customer customer = session.find(Customer.class, customerId);
 		return customer;
 	}
 
 	public void saveCustomer(Customer customer) {
 		Session session = getSession();
 		session.persist(customer);	
 	}
	public void updateCustomer(Customer customer) {
 		Session session = getSession();
 		session.merge(customer);
	}
	public void deleteCustomer(int customerId ) {
 		Session session = getSession();
 		Customer customer = session.find(Customer.class, customerId);
 		session.remove(customer);	
 	}
 	

}

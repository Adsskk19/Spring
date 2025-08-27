package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;



//Data Access Object
@Component("empDao")
@Transactional
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Employee getEmployee(int id) {
		Session session = getSession();
		Employee employee = session.find(Employee.class,id);
		return employee;
	}
	public void saveEmployee(Employee emp) {
		Session session = getSession();
		session.persist(emp);
		
		//How Transactional works when persist fails , How it rollec back to prvs table.
//		if(true) {
//			throw new RuntimeException();
//		}
//		session.persist(new Employee("dummy@gmail.com",45097));
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void updateEmployee(Employee emp) {
		Session session = getSession();
		session.persist(emp);
		
		//How Transactional works when persist fails , How it rollec back to prvs table.
//		if(true) {
//			throw new RuntimeException();
//		}
//		session.persist(new Employee("dummy@gmail.com",45097));
	}
	

}

package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
	EmployeeDao employeeDao = container.getBean("empDao",EmployeeDao.class);
	Employee employee = employeeDao.getEmployee(1);
	System.out.println(employee);
	
//	employeeDao.saveEmployee(new Employee("exception@gmail.com",36728));
		
		
		
		
	}

}

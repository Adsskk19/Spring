package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//you have to configure the xml file & have to give that to Application context.
	//	ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");	
	//	getEmployee(container);
//	Student student = container.getBean("st",Student.class);
//	System.out.println(student);
//	System.out.println(student.getAddress());
		
		
	ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);	
	
		User user = container.getBean("user",User.class);
		System.out.println(user);
		User user1 = container.getBean("user",User.class);
		System.out.println(user1);
		System.out.println(user==user1);
		
		
	}





	private static void getEmployee(ApplicationContext container) {
		Employee employee = container.getBean("emp",Employee.class);
		System.out.println(employee);
		System.out.println(employee.getHobbies());
	}

	
	
	
	
	private static void studentDetails(ApplicationContext container) {
		Student student = container.getBean("st",Student.class);
		System.out.println(student);
		
		Student student2 = container.getBean("st",Student.class);
		//System.out.println(student==student2);
		//You will get same object only
		System.out.println(student2);
		
		Student student3 = container.getBean("st2",Student.class);
		System.out.println(student3);
	}

}

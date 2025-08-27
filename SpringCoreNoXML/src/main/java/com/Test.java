package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//58th min No xml session starts
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		Student student = container.getBean("stu",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		
	
	}

}

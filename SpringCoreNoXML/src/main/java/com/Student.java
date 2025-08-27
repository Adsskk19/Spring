package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("${id}")
	private int studentId;
	@Value("${name}")
	private String name;
	@Autowired
	private Address address;
	public Student() {
		System.out.println("Student Object created");
	}

	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public Student(int studentId, String name, Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public Address getAddress() {
		return address;
	}


	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}








	

}

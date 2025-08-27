package com;

public class Test {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		
//		System.out.println(emp1==emp2);
		Employee employee = Employee.getEmployee();
		Employee employee2 = Employee.getEmployee();
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee==employee2);
	}
}

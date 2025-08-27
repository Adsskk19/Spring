package com;

import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int empId;
	
	private Set<String> skills;
	
	private Map<Integer, String> hobbies;
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	public Map<Integer, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", skills=" + skills + ", hobbies=" + hobbies + "]";
	}
	
	

}

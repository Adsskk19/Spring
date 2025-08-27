package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("Kiran.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		
	// template.update("Insert into mycustomers values(?,?)",1,"Shakti");
		// template.update("Update mycustomers set name=? where customerId=?","Shree Hari",2);
	// template.update("Delete from mycustomers where customerId=?",1);

	// System.out.println("updated");
		
		
	//	Test.customer(template);
		 
		List<Customer> customerList = template.query("select * from mycustomers", new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getInt(1),rs.getString(2));
			}
			
		}); 
		System.out.println(customerList);
		
		
		
		
		
		
	
	
	}

	private static void customer(JdbcTemplate template) {
		Customer customer = template.queryForObject("select * from mycustomers where customerId=?",new RowMapper<Customer>(){

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getInt(1),rs.getString(2));
			}
			
			
		},2);
		System.out.println(customer);
	}
	

}

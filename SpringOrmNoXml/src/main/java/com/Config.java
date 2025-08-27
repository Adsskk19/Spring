package com;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com")//This scan is for spring beans
@EnableTransactionManagement
public class Config {
	
	@Bean
	public DataSource mydataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource("jdbc:mysql://localhost:3306/flm_adv_java","root","kiran");
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		
		localSessionFactoryBean.setDataSource(mydataSource());
		localSessionFactoryBean.setPackagesToScan("com");//This scan is for Hibernate
		
		Properties props = new Properties();
		props.put("hibernate.show_sql", true);
		props.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		
		localSessionFactoryBean.setHibernateProperties(props);
		return localSessionFactoryBean;

	}
	
	@Bean
	public HibernateTransactionManager hibTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		
		return transactionManager;
		
	}
	
	
	
	

}

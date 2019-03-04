package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeDAOImpl {
	
	@Autowired
	@Qualifier(value="dataSource1")
	private DataSource dataSource;

	public void insert(Employee employee) {
		System.out.println("Employee Saved");
		System.out.println(employee.getId() + " - " +employee.getName());

	}
	}

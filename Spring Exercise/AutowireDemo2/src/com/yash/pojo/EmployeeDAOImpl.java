package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAOImpl {
	@Autowired
	private DataSource dataSource;

	public void insert(Employee employee) {
		System.out.println("Employee Saved");
		System.out.println(employee.getId() + " - " +employee.getName());

	}
	}

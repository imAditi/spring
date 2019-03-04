package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class EmployeeDAOImpl {
	
	@Autowired
	private DataSource dataSource;

	public void insert(Employee employee) {
		System.out.println("Employee Saved");
		System.out.println(employee.getId() + " - " +employee.getName());

	}
	}

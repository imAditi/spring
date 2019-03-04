package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDAOImpl employeedaoImpl;
	
	public void save(Employee employee) {
		employeedaoImpl.insert(employee);
	}
	
}

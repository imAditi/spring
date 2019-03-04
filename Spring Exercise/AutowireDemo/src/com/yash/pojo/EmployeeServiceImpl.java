package com.yash.pojo;

public class EmployeeServiceImpl {

	private EmployeeDAOImpl employeedaoImpl;


	
	public void setEmployeedaoImpl(EmployeeDAOImpl employeedaoImpl) {
		this.employeedaoImpl = employeedaoImpl;
	}



	public void save(Employee employee) {
		employeedaoImpl.insert(employee);
	}
	
}

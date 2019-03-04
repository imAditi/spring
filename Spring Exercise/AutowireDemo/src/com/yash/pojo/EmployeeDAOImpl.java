package com.yash.pojo;

public class EmployeeDAOImpl {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Employee employee) {
		System.out.println("Employee Saved");
		System.out.println(employee.getId() + " - " +employee.getName());
	}
	}

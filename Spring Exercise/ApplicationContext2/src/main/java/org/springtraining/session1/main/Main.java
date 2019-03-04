package org.springtraining.session1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtraining.session1.service.EmployeeService;
import org.springtraining.session1.service.EmployeeServiceImpl;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService employeeService = (EmployeeServiceImpl)context.getBean("empServiceBean");
	System.out.println("EmployeeId: "+employeeService.generateEmployeeId());
}
}

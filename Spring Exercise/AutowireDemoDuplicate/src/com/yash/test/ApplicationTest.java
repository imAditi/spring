package com.yash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.Employee;
import com.yash.pojo.EmployeeServiceImpl;

public class ApplicationTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/beans.xml");
		Employee employee = new Employee();
		employee.setId(12);
		employee.setName("Anurag");
		EmployeeServiceImpl employeeServiceImpl = context.getBean("employeeServiceImpl",EmployeeServiceImpl.class);
		employeeServiceImpl.save(employee);

	}

}

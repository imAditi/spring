package com.yash.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Employee;


public class ApplicationTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Employee employee = context.getBean("employee",Employee.class);
	System.out.println(employee.getName());
}
}

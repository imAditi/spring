package com.yash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.DAOTest;

public class ApplicationTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	DAOTest daoTest = context.getBean("daoTest", DAOTest.class);
	System.out.println(daoTest);
}
}

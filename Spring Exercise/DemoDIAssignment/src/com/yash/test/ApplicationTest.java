package com.yash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.ApplicationIssue;
import com.yash.pojo.Issues;

public class ApplicationTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/beans.xml");
		ApplicationIssue applicationIssue = context.getBean("applicationIssue",ApplicationIssue.class);
		System.out.println(applicationIssue);
		Issues[] iss = applicationIssue.getIssue();
		for (Issues issues : iss) {
			System.out.println(issues);
		}
	
	}

}

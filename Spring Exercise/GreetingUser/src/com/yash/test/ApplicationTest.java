package com.yash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.GreetingUser;


public class ApplicationTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	GreetingUser greetingUser1 = context.getBean("morning",GreetingUser.class);
	GreetingUser greetingUser2 = context.getBean("evening",GreetingUser.class);
	greetingUser1.greetUser("Aditi");
	greetingUser2.greetUser("Amisha");
}
}

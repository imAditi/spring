package org.springtraining.session1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtraining.session1.service.GreetingMessageService;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl", GreetingMessageService.class);
	System.out.println(greetingMessageService.greetUser());
}
}

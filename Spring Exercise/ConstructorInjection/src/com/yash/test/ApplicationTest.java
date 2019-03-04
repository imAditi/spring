package com.yash.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Test;

public class ApplicationTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Test test = context.getBean("daoTest",Test.class);
//	List trainees = test.getTraineeName();
//	Set technologies = test.getTechnologies();
//	Map mentors = test.getTraineeMentor();
//	
//	System.out.println(trainees);
//	System.out.println(technologies);
//	System.out.println(mentors);
//	System.out.println(trainees.getClass().getName());
//	System.out.println(technologies.getClass().getName());
//	System.out.println(mentors.getClass().getName());
//	
}
}

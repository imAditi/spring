package com.yash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.HelloWorld;

public class ApplicationTest {
public static void main(String[] args) {
	Resource resource = new ClassPathResource("beans.xml"); 
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	HelloWorld helloWorld1 = (HelloWorld)beanFactory.getBean("hello");
	HelloWorld helloWorld2 = (HelloWorld)beanFactory.getBean("hello");
	//System.out.println(helloWorld1.showGreeting());
	//System.out.println(helloWorld2.showGreeting());
	System.out.println("helloWorld1 : "+helloWorld1.hashCode());
	System.out.println("helloWorld2 : "+helloWorld1.hashCode());
}
}

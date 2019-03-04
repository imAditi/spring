package com.yash.samplespringrestdemo.daoimpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.dao.ContactDAO;
import com.yash.samplespringrestdemo.dao.UserDAO;
import com.yash.samplespringrestdemo.domain.Contact;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserDAOImpl_FindByPropertyOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
	List<Contact> contacts = contactDAO.findByProperty("group_name", "yash");
	
	for (Contact contact : contacts) {
		
		System.out.println("contact name : "+contact.getName());
		System.out.println("contact phone : "+contact.getPhone());
		
	}
}
}

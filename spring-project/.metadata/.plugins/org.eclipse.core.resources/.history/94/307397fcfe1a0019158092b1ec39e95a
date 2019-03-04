package com.yash.samplespringrestdemo.daoimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.dao.ContactDAO;

import com.yash.samplespringrestdemo.domain.Contact;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;


public class TestContactDAOImpl_FindByIdOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
	Contact contact = contactDAO.findById(2);
	System.out.println("contact name : "+contact.getName());
}
}

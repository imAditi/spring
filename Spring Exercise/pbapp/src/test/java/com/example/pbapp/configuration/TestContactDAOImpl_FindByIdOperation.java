package com.example.pbapp.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;

public class TestContactDAOImpl_FindByIdOperation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
		Contact contact =  contactDAO.findById(1);

		System.out.println("Name : "+contact.getName());

	}

}
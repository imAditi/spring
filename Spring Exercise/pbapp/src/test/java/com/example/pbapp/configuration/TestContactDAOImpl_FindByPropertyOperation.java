package com.example.pbapp.configuration;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;

public class TestContactDAOImpl_FindByPropertyOperation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
		List<Contact> contacts =  contactDAO.findByProperty("address", "Indore");

		for (Contact u : contacts) {
			System.out.println("Name : "+u.getName());
		}


	}

}
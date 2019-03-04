package com.example.pbapp.configuration;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;

public class TestContactDAOImpl_SaveOperation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
		// contact information will be received by user-reg-form
		Contact contact = new Contact();
		contact.setUserid(2);
		contact.setName("Anu");
		contact.setGroup_name("Family");
		contact.setPhone("8978948");
		contactDAO.save(contact);

		System.out.println("Success! Data Inserted");

	}

}
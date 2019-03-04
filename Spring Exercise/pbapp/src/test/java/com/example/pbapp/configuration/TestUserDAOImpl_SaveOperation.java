package com.example.pbapp.configuration;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;

public class TestUserDAOImpl_SaveOperation {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		// user information will be received by user-reg-form
		User user = new User();
		user.setName("Aditi");
		user.setEmail("aditi@yash.com");
		user.setPhone("8748764");
		user.setStatus(1); // Active user
		user.setRole(2); // Guest User
		user.setLoginname("aditi");
		user.setPassword("aditi123");
		userDAO.save(user);

		System.out.println("Success! Data Inserted");

	}

}
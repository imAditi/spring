package com.example.pbapp.configuration;


import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;

public class TestUserDAOImpl_DeleteOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAO.class);
	User user = new User();
	userDAO.delete(1);
	System.out.println("Success: data deleted");
}
}

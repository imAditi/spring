package com.yash.samplespringrestdemo.daoimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.dao.UserDAO;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserDAOImpl_UpdateOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAO.class);
	User user = new User();
	user.setId(1);
	user.setName("Arju");
	user.setPhone("123456");
	user.setAddress("Indore");
	user.setEmail("a@yash");
	user.setStatus(1);
	user.setRole(1);
	user.setPassword("a");
	userDAO.update(user);
	System.out.println("user updated");
}
}

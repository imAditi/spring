package com.yash.samplespringrestdemo.daoimpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.dao.UserDAO;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserDAOImpl_FindAllOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAO.class);
	List<User> users = userDAO.findAll();
	for (User user : users) {
		
		System.out.println("user name : "+user.getName());
		System.out.println("user email : "+user.getEmail());
	}
}
}

package com.yash.samplespringrestdemo.daoimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.dao.UserDAO;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserDAOImpl_FindByIdOperation {
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userDAO = ctx.getBean(UserDAO.class);
	User user = userDAO.findById(1);
	System.out.println("user name : "+user.getName());
}
}

package com.yash.samplespringrestdemo.serviceimpl;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.exception.UserAlreadyExistException;
import com.yash.samplespringrestdemo.service.UserService;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserServiceImpl_RegisterOperation {

	public static void main(String[] args) throws UserAlreadyExistException {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		User user = new User();
		user.setName("Arju");
		user.setStatus(1);
		user.setRole(1);
		user.setLoginname("arju");
		user.setPassword("123a");
		userService.register(user);
		
		System.out.println("user inserted");
	}
}

package com.yash.samplespringrestdemo.serviceimpl;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.exception.BlockUserException;
import com.yash.samplespringrestdemo.service.UserService;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestUserServiceImpl_LoginOperation {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		
		try {
			User user = userService.login("arju","1");
			if(user==null) {
				System.out.println("wrong login name or password");
			}else {
			System.out.println(user.getName());
			}
		} catch (BlockUserException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}

package com.example.pbapp.configuration;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pbapp.domain.User;
import com.example.pbapp.service.UserService;

public class TestUserServiceImpl_RegisterOperation {
public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserService userService = ctx.getBean(UserService.class);
	User user = new User();
	user.setName("Arihant");
	user.setEmail("arihant@gmail.com");
	user.setStatus(userService.USER_STATUS_ACTIVE); 
	user.setRole(userService.ROLE_USER); 
	user.setLoginname("Arihant");
	user.setPassword("Arihant12");
	Date date =  new Date();
	user.setCreated_At(date);
	user.setUpdated_At(date);
	userService.register(user);

	System.out.println("Success! User Registered");

}
}

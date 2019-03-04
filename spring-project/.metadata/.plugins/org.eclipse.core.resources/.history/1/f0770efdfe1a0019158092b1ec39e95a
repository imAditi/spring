package com.yash.samplespringrestdemo.serviceimpl;




import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.samplespringrestdemo.domain.Contact;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.exception.BlockUserException;
import com.yash.samplespringrestdemo.service.ContactService;
import com.yash.samplespringrestdemo.service.UserService;
import com.yash.samplespringrestdemo.configuration.SpringRootConfig;

public class TestContactServiceImpl_FreeTextSearchOperation {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactService contactService = ctx.getBean(ContactService.class);
		
			List<Contact> contacts = contactService.findUserContact(3, "ya");
			for (Contact contact : contacts) {
				System.out.println(contact.getPhone());
			}
		
		
	}
}

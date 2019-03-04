package org.springtraining.session1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

	@Override
	public String greetUser() {
		return "Good Morning";
	}

	@Override
	public String greetUser1() {
		return "Good Evening";
	}
	
}

package com.yash.pojo;

public class EveningGreet implements GreetingUser {

	@Override
	public void greetUser(String userName) {
		System.out.println("Evening Greeting" +userName);
		
	}

}

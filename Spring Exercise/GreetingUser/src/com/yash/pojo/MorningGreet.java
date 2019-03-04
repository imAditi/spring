package com.yash.pojo;

public class MorningGreet implements GreetingUser {

	@Override
	public void greetUser(String userName) {
		System.out.println("Morning Greeting" +userName);
		
	}

}

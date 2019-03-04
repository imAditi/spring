package com.yash.samplespringrestdemo.exception;

public class UserIdExceptionResponse {

	private String UserId;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public UserIdExceptionResponse(String UserId) {
		super();
		this.UserId = UserId;
	}

}

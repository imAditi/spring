package com.yash.pojo;

import java.util.Arrays;

public class ApplicationIssue {

	private Issues[] issue;

	public Issues[] getIssue() {
		return issue;
	}

	public void setIssue(Issues[] issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "ApplicationIssue [issue=" + Arrays.toString(issue) + "]";
	}
	
	
}

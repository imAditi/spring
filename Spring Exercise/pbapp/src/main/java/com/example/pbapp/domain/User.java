package com.example.pbapp.domain;

import java.util.Date;

/**
 * This user model is used as a traveller form layer to layer
 * 
 * @author aditi.jain
 *
 */
public class User extends Person {
	/**
	 * status of user 1: Active 2: Block By default user will be active at
	 * registration time
	 */
	private int status;
	/**
	 * role of user 1: Admin 2: User By default user will be User at registration
	 * time
	 */
	private int role;
	/**
	 * loginname of user
	 */
	private String loginname;
	/**
	 * password of user
	 */
	private String password;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

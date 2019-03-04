package com.example.pbapp.domain;

import java.util.Date;

/**
 * This person model will hold the common properties from user and contacts
 * 
 * @author aditi.jain
 *
 */
public class Person {
	/**
	 * id of person, primary key
	 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	/**
	 * name of person
	 */
	private String name;
	/**
	 * phone of person
	 */
	private String phone;
	/**
	 * address of person
	 */
	private String address;
	/**
	 * email of person
	 */
	private String email;
	/**
	 * Date-time when person is created first time
	 */
	private Date created_At;
	/**
	 * Date-time when person is updated
	 */
	private Date updated_At;
}
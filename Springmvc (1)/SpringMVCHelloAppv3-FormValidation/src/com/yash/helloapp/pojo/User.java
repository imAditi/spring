package com.yash.helloapp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class User {

	@Size(min=4 ,max=10)
	private String name;
	private String contact;
	private String email;
	private Date joining;
	List<String> skills = new ArrayList<>();
	private Address address;
	public String getName() {
		return name;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

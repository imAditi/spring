package com.yash.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
private String name;
private String contact;

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getName() {
	return name;
}
@Required
public void setName(String name) {
	this.name = name;
}
}


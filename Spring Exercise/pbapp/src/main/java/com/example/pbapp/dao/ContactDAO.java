package com.example.pbapp.dao;

import java.util.List;

import com.example.pbapp.domain.Contact;

/**
 * This ContactDAO interface will perform CRUD operations related to contact
 * 
 * @author aditi.jain
 *
 */
public interface ContactDAO {
	public void save(Contact contact);

	public void update(Contact contact);

	public void delete(int contactId);

	public void delete(Contact contact);

	public Contact findById(int contactId);

	public List<Contact> findAll();

	public List<Contact> findByProperty(String propertyName, Object propertyValue);
}

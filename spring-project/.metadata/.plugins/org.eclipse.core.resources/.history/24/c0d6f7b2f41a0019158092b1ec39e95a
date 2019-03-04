package com.yash.samplespringrestdemo.dao;

import java.util.List;

import com.yash.samplespringrestdemo.domain.Contact;

/**
 * This ContactDAO interface will perform all crud operation related to Contact
 * @author anurag.mahajan
 *
 */
public interface ContactDAO {
	
	public void save(Contact contact);

	public void update(Contact contact);
	
	public void delete(Integer contactId);
	
	public void delete(Contact contact);
	
	public Contact findById(Integer contactId);
	
	public List<Contact> findAll();
	
	public List<Contact> findByProperty(String propertyName, Object propertyValue);
}

package com.example.pbapp.serviceimpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.service.ContactService;
import com.example.pbapp.service.UserService;

@Service
public class ContactServiceImpl extends BaseDAO implements ContactService {

	public void save(Contact contact) {
		
	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Integer contactId) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Integer[] contactIds) {
		// TODO Auto-generated method stub
		
	}

	public List<Contact> findUserContact(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> findUserContact(Integer userId, String txt) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
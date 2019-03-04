package com.yash.samplespringrestdemo.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.samplespringrestdemo.dao.BaseDAO;
import com.yash.samplespringrestdemo.dao.ContactDAO;
import com.yash.samplespringrestdemo.domain.Contact;
import com.yash.samplespringrestdemo.rowmapper.ContactRowMapper;
import com.yash.samplespringrestdemo.service.ContactService;

@Service
public class ContactServiceImpl extends BaseDAO implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	public void save(Contact contact) {
		contactDAO.save(contact);
	}

	public void update(Contact contact) {
		contactDAO.update(contact);
	}

	public void delete(Integer contactId) {
		contactDAO.delete(contactId);
	}

	public void delete(Integer[] contactIds) {
		for (Integer contactId : contactIds) {
			delete(contactId);
		}

	}

	public List<Contact> findUserContact(Integer userId) {
	
		return contactDAO.findByProperty("userid", userId);
	}

	public List<Contact> findUserContact(Integer userId, String txt) {
		
		String criteria="%"+txt+"%";
		String sql = "SELECT * FROM contacts WHERE userid=:userId and (name LIKE :txt or phone LIKE  :txt or group_name LIKE :txt or address LIKE :txt or email LIKE :txt or remark LIKE :txt)";
		//String sql = "SELECT * FROM contacts WHERE userid=:userId and (name LIKE :txt )";
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userId", userId);
		map.put("txt",criteria );
		List<Contact> contacts = getNamedParameterJdbcTemplate().query(sql, map,new ContactRowMapper());		
		return contacts;
	}

}

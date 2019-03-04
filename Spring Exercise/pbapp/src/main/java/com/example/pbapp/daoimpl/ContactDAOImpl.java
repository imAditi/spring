package com.example.pbapp.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;
import com.example.pbapp.rowmapper.ContactRowMapper;
import com.example.pbapp.rowmapper.UserRowMapper;

@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO {

	public void save(Contact contact) {
		String sql = "INSERT INTO contacts(userid,name,group_name,phone) VALUES (:userid,:name,:group_name,:phone)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userid",contact.getUserid());
		params.put("name",contact.getName());
		params.put("group_name",contact.getGroup_name());
		params.put("phone",contact.getPhone());
		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		KeyHolder kh = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, paramSource, kh);
		Integer id = kh.getKey().intValue();
		contact.setId(id);

	}

	public void update(Contact contact) {
	String sql = "UPDATE contacts " + "set name=:name, " + "phone=:phone," + "address=:address," + "email=:email,"
			+ "remark=:remark, " + "userid=:userid," + "group_name=:group_name " + "WHERE id=:id";
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("name", contact.getName());
	params.put("phone", contact.getPhone());
	params.put("address", contact.getAddress());
	params.put("email", contact.getEmail());
	params.put("remark", contact.getRemark());
	params.put("userid", contact.getUserid());
	params.put("group_name", contact.getGroup_name());
	params.put("id", contact.getId());
	SqlParameterSource paramSource = new MapSqlParameterSource(params);
	getNamedParameterJdbcTemplate().update(sql, paramSource);
	}

	public void delete(int contactId) {
			String sql = "DELETE from contacts WHERE id = ?";
			getJdbcTemplate().update(sql, contactId);
		}
		public void delete(Contact contact) {
		this.delete(contact.getId());
	}

	public Contact findById(int contactId) {
		String sql = "SELECT * FROM contacts WHERE id = ?";
		Contact contact = getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), contactId);
		return contact;
	}

	public List<Contact> findAll() {
		String sql = "SELECT * FROM contacts";
		List<Contact> contacts = getJdbcTemplate().query(sql, new ContactRowMapper());
		return contacts;
	}

	public List<Contact> findByProperty(String propertyName, Object propertyValue) {
		String sql = "SELECT * FROM contacts WHERE " + propertyName + "=?";
		List<Contact> contacts = getJdbcTemplate().query(sql, new ContactRowMapper(), propertyValue);
		return contacts;
	}
}
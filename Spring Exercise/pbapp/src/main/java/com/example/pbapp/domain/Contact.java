package com.example.pbapp.domain;

import java.util.Date;

/**
 * Contact model is used as adata traveler from layer to layer
 * 
 * @author aditi.jain
 *
 */
public class Contact extends Person {
	/**
	 * id of user
	 */
	private int userid;
	/**
	 * group like - family, friends, business, etc.
	 */
	private String group_name;
	/**
	 * remark of contact
	 */
	private String remark;
	/**
	 * Date - time when contact is created first time
	 */
	private int created_By;
	/**
	 * Date - time when contact updates
	 */
	private int updated_By;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getCreated_By() {
		return created_By;
	}

	public void setCreated_By(int created_By) {
		this.created_By = created_By;
	}

	public int getUpdated_By() {
		return updated_By;
	}

	public void setUpdated_By(int updated_By) {
		this.updated_By = updated_By;
	}

}

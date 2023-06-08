package edu.learning.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // to specify the table has be there inside DB
public class UserInfo {
	@Id 	// to mark the variable as a primary key column in DB
	private int uid;
	private String name;
	private String email;
	private String contact;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}

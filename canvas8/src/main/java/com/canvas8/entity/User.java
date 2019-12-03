package com.canvas8.entity;

import java.util.Date;

public class User {
private String firstname;
	
	private String lastname;
	
	private int  userId;
	
	private int  corporategroupid;
	
	private String email;
	private String password;
	
	private boolean  account_locked; // default value given false
	
	private boolean  enabled;// default value given true
	
	private Date createdDate;
	private Date expiryDate;
	private String  postcode;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCorporategroupid() {
		return corporategroupid;
	}
	public void setCorporategroupid(int corporategroupid) {
		this.corporategroupid = corporategroupid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccount_locked() {
		return account_locked;
	}
	public void setAccount_locked(boolean account_locked) {
		this.account_locked = account_locked;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "UserDtO [firstname=" + firstname + ", lastname=" + lastname + ", userId=" + userId
				+ ", corporategroupid=" + corporategroupid + ", email=" + email + ", password=" + password
				+ ", account_locked=" + account_locked + ", enabled=" + enabled + ", createdDate=" + createdDate
				+ ", expiryDate=" + expiryDate + ", postcode=" + postcode + "]";
	}
	
	
	

}

package com.prashant.modal;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class User {
	
	@Id
	private int crmid;
	private String firstname;
	private String lastname;
	private String email;
	private int assetid;
	public User(int crmid, String firstname, String lastname, String email, int assetid) {
		super();
		this.crmid = crmid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.assetid = assetid;
	}
	
	public User() {}

	public int getCrmid() {
		return crmid;
	}

	public void setCrmid(int crmid) {
		this.crmid = crmid;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAssetid() {
		return assetid;
	}

	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}

	@Override
	public String toString() {
		return "User [crmid=" + crmid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", assetid=" + assetid + "]";
	}
	
	
	
}

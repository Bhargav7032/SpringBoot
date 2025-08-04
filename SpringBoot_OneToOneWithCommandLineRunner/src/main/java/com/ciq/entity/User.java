package com.ciq.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tab")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	private Profile Profile;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uname, com.ciq.entity.Profile profile) {
		super();
		this.id = id;
		this.uname = uname;
		Profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Profile getProfile() {
		return Profile;
	}
	public void setProfile(Profile profile) {
		Profile = profile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", Profile=" + Profile + "]";
	}
	
	
}

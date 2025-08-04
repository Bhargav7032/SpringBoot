package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int did;
	private String dname;
	private String pname;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, String pname) {
		super();
		this.did = did;
		this.dname = dname;
		this.pname = pname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", pname=" + pname + "]";
	}
	
}

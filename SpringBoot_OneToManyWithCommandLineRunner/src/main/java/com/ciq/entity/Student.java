package com.ciq.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int sid;
	private String sname;
	private Double sfee;
	private String spin;
    
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bid")
	private Branch branch;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, Double sfee, String spin, Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.spin = spin;
		this.branch = branch;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSfee() {
		return sfee;
	}

	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) {
		this.spin = spin;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", spin=" + spin + ", branch=" + branch
				+ "]";
	}

	
	
	
	
}

package com.ciq.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Branch {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	@OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
	private List<Student> students;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int bid, String bname, List<Student> students) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.students = students;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", students=" + students + "]";
	}
	
}

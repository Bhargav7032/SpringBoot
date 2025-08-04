package com.ciq.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int sid;
	private String sname;
	private Double sfee;
	@ManyToMany
	@JoinTable(
	    name = "student_course",
	    joinColumns = @JoinColumn(name = "sid"),
	    inverseJoinColumns = @JoinColumn(name = "cid")
	)
	private List<Course> course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, Double sfee, List<Course> course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.course = course;
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
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", course=" + course + "]";
	}
	
	

}

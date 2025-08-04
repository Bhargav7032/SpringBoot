package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pbio;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int pid, String pbio) {
		super();
		this.pid = pid;
		this.pbio = pbio;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPbio() {
		return pbio;
	}

	public void setPbio(String pbio) {
		this.pbio = pbio;
	}

	@Override
	public String toString() {
		return "Profile [pid=" + pid + ", pbio=" + pbio + "]";
	}

}

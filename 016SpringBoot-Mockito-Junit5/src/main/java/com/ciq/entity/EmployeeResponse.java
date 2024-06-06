package com.ciq.entity;

import lombok.Data;

@Data
public class EmployeeResponse {

	private Employee employee;
	
	private Deparement deparement;
	
	private Address address;
}

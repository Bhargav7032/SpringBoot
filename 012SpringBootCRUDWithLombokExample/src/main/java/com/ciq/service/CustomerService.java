package com.ciq.service;

import java.util.List;

import com.ciq.entity.Customer;

public interface CustomerService {
	
	public void add(Customer customer);
	
	public void update(Customer customer);
	
	public Customer findbyid(Integer cid);
	
	public List<Customer>findall();
	
	public void deletebyid(Integer cid);

}

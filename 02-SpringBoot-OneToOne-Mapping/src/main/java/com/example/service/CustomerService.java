package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {
	
	public void save(Customer customer);

	public void update(Customer customer);

	public Customer FindByid(int id);

	public List<Customer> findAll();

	public void DeletedById(int id);
	

}

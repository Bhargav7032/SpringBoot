package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Customer;
import com.ciq.repositroy.CustomerRepositroy;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepositroy customerRepositroy;

	@Override
	public void add(Customer customer) {
		customerRepositroy.save(customer);
	}

	
	@Override
	public void update(Customer customer) {
		customerRepositroy.save(customer);
		
	}

	@Override
	public Customer findbyid(Integer cid) {
		return customerRepositroy.findById(cid).get();
	}

	@Override
	public List<Customer> findall() {
		return customerRepositroy.findAll();
	}
	@Override
	public void deletebyid(Integer cid) {
		customerRepositroy.deleteById(cid);
		
	}

	
}

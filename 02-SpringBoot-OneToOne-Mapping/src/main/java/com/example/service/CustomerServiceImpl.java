package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);

	}

	@Override
	public void update(Customer customer) {
		customerRepository.save(customer);

	}

	@Override
	public Customer FindByid(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public void DeletedById(int id) {
		customerRepository.deleteById(id);
	}

}

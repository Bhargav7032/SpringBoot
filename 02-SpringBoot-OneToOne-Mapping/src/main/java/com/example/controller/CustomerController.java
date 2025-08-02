package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.entity.Items;
import com.example.service.CustomerService;
import com.example.service.ItemsService;

@RestController 
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/savecustomer")
	public Customer Save(@RequestBody Customer customer) {
		 customerService.save(customer);
		 return customer;
	}
	@PutMapping("/updatecustomer")
	public Customer update(@RequestBody Customer customer) {
		 customerService.update(customer);
		 return customer;
	}
	
	@GetMapping("/findAllcustomer")
	public List<Customer>FindAllcustomer(){
		return customerService.findAll();
		
	}

	@GetMapping("/findByid/{id}")  
    public Customer findByIdCustomer(@PathVariable("id") int id) {
        return customerService.FindByid(id);
    }
		
	@DeleteMapping("deletedbyid/{id}")
	public String Deletedbyid(@PathVariable("id") int id) {
		 customerService.DeletedById(id);
		 return "Deletedbyid succefully...!"+id;
		
	}
}

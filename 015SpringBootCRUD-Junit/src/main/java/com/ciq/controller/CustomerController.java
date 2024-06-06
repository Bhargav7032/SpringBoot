package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Customer;
import com.ciq.service.CustomerService;
@RestController
@RequestMapping("/rest")
public class CustomerController {
@Autowired
private CustomerService customerService;

@PostMapping
public ResponseEntity<?>add(@RequestBody Customer customer){
 customerService.add(customer);
 return ResponseEntity.ok("inserted SuccessFully");
	
}
@PutMapping
public ResponseEntity<?>Update(@RequestBody Customer customer){
 customerService.update(customer);
 return ResponseEntity.ok("Updated SuccessFully");

}

@DeleteMapping("{cid}")
public ResponseEntity<?>Deletebyid(@PathVariable Integer cid){
 customerService.deletebyid(cid);
 return ResponseEntity.ok("Deletebyid SuccessFully");
}

@GetMapping("{cid}")
public ResponseEntity<?>findbyid(@PathVariable Integer cid){
 return ResponseEntity.ok(customerService.findbyid(cid));
}

@GetMapping
public ResponseEntity<?>find(){
 return ResponseEntity.ok(customerService.findall());
}
}

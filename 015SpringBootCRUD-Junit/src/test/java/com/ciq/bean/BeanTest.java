package com.ciq.bean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.service.CustomerService;

@SpringBootTest
public class BeanTest {

	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testcustomerservice() {
		assertNotNull(customerService);
		
	}
}

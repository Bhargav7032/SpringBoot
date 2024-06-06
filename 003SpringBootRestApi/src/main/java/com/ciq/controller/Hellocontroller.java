package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Hellocontroller {
	
	@Value("${myname}")
	private String name;

	@Value("${location}")
	private String location;
	
	@Autowired
	private Environment environment;
	
	
	@GetMapping("/hello")
	public  @ResponseBody String Sayhello() {
		System.out.println("Name : "+environment.getProperty("myname")+" Location : "+environment.getProperty("location"));
		return "Hello "+name+" : "+location;
	}		
	}
	
	


package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Course;
import com.example.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice; 
	
	
	@PostMapping("/savecourse")
	public Course save(@RequestBody Course course) {
		courseservice.save(course);
		return course;
	}
	@PutMapping("/updatecourse")
	public Course Update(@RequestBody Course course) {
		courseservice.update(course);
		return course;
	}
	@GetMapping("/findbyCourseid/{id}")
	public Course findbyid(@PathVariable int id) {
		return courseservice.findbyId(id);
	}
	
	@GetMapping("/findAllcourse")
	public List<Course> findAll(){
		return courseservice.findAll();
	}
	@DeleteMapping("/deletedbyid/{id}")
	public String deletedbyid(@PathVariable int id) {
		courseservice.deletebyid(id);
		return " Course deletedbyid Succefully";
		
	}


}

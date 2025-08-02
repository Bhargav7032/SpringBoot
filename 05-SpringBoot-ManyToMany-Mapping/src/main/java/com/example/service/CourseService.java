package com.example.service;

import java.util.List;

import com.example.entity.Course;

public interface CourseService {
	
	public void save(Course course);

	public void update(Course course);

	public List<Course> findAll();

	public Course findbyId(int id);

	public void deletebyid(int id);



}

package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Course;
import com.example.repositroy.CouresRepositroy;

@Service
public class CourseServiceImpl  implements CourseService{
	
	private CouresRepositroy couresRepositroy;


	@Override
	public void save(Course course) {
		couresRepositroy.save(course);
	}

	@Override
	public void update(Course course) {
		couresRepositroy.save(course);
	}
	@Override
	public List<Course> findAll() {
		return couresRepositroy.findAll();
	}

	@Override
	public Course findbyId(int id) {
		return couresRepositroy.findById(id).get();
	}

	@Override
	public void deletebyid(int id) {
		couresRepositroy.deleteById(id);
	}

}

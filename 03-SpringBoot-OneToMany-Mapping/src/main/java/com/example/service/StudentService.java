package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	public void save(Student student);

	public void update(Student student);

	public List<Student> findAll();

	public Student findbyId(int sid);

	public void deletebyid(int sid);

	
}

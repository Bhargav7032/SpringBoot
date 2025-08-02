package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repositroy.StudentRepositroy;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepositroy studentRepositroy;
	
	
	@Override
	public void save(Student student) {
		studentRepositroy.save(student);
	}

	@Override
	public void update(Student student) {
		studentRepositroy.save(student);

	}

	@Override
	public List<Student> findAll() {
		return studentRepositroy.findAll();
	}

	@Override
	public Student findbyId(int sid) {
		return studentRepositroy.findById(sid).get();
	}

	@Override
	public void deletebyid(int sid) {
		studentRepositroy.findById(sid);

	}

	
}

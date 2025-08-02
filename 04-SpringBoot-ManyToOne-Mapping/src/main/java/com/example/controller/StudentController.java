package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Course;
import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student save(@RequestBody Student student) {

		if (student.getCourses() != null) {
			for (Course course : student.getCourses()) {
				course.setStudent(student); // Important: link each course to the student
			}
		}
		studentService.save(student);
		return student;

	}

	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		studentService.update(student);
		return student;
	}

	@GetMapping("/findbyid/{id}")
	public Student findbyid(@PathVariable int id) {
		return studentService.findbyId(id);

	}

	@GetMapping("/deletedbyid/{id}")
	public String Deletedbyid(@PathVariable int id) {
		studentService.deletebyid(id);
		return "Deletedbyid succefully..!";
	}

	@GetMapping("/findAll/{id}")
	public List<Student> findAll() {
		return studentService.findAll();
	}

}

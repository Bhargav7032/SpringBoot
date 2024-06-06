package com.ciq.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Student;

//@Controller
@RestController
public class StudentController {

//	@GetMapping("/hello")
//	public @ResponseBody  String  sayhello() {
//		return "Hello BhargavRam....!";
//		
//	}
	
	@GetMapping("/hello")
	public String  sayhello() {
		return "Hello BhargavRam....!";
		
	}
	
	
	@GetMapping("/stud")
	public Student get(Student student) {
		return new Student("BhargavRam", "Panga");
		
	}
	
	// call list of Student//
	
	@GetMapping("/studs")
	public List<Student>getstudents(Student Student){
		List<Student> studs=new ArrayList<>();
		studs.add(new Student("panga", "Simhadri"));
		studs.add(new Student("panga", "MahaLaxmi"));
		studs.add(new Student("panga", "VaraLaxmi"));
		studs.add(new Student("panga", "RamaRao"));
		studs.add(new Student("panga", "Bharthi"));
		studs.add(new Student("panga", "Bhargav"));
		studs.add(new Student("panga", "Chiranjeevi"));
		studs.add(new Student("panga", "AppaRao"));
		studs.add(new Student("panga", "Sudhashini"));
		studs.add(new Student("panga", "Vinodhini"));
		studs.add(new Student("panga", "Nandhini"));
		return studs;
		
	}
	   // set PathVariable//
	
	@GetMapping("/stud/{Fname}/{Lname}")
	public Student Setpathvariable(@PathVariable("Fname")String fname,@PathVariable("Lname")String lname) {
		return new Student(fname, lname);
	
	}
	
	// set PathVariable//
	
	@GetMapping("/stud/RequestParam")
	public Student SetRequestParam(@RequestParam("Fname")String fname,@RequestParam("Lname")String lname) {
		return new Student(fname, lname);
}
}
package com.ciq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ciq.entity.Branch;
import com.ciq.entity.Student;
import com.ciq.repositroy.BranchRepositroy;
import com.ciq.repositroy.StudentRepositroy;


@SpringBootApplication
public class SpringBootOneToManyWithCommandLineRunnerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyWithCommandLineRunnerApplication.class, args);
	}
	
	@Autowired
	private StudentRepositroy studentRepositroy;
	
	@Autowired
	private BranchRepositroy branchRepositroy;

	@Override
	public void run(String... args) throws Exception {
		
//		Branch branch = new Branch();
//		branch.setBname("MPC");
//	
//		Student student  =new Student();
//		student.setSname("Bhargav");
//		student.setSfee(34000.00);
//		student.setBranch(branch);
//		
//		Student student2  =new Student();
//		student2.setSname("Prasad");
//		student2.setSfee(34000.00);
//		student2.setBranch(branch);
//		
//		Student student3  =new Student();
//		student3.setSname("Balaji");
//		student3.setSfee(34000.00);
//		student3.setBranch(branch);
//		
//		
//		List<Student> students = List.of(student,student2,student3);
//		
//		branch.setStudents(students);
//		
//		
//		branchRepositroy.save(branch);
		
		
		
		
		Branch branch = new Branch();
		branch.setBname("MPC");		
		
		Student student  =new Student();
		student.setSname("Bhargav");
		student.setSfee(34000.00);
		student.setBranch(branch);
		student.setSpin("23445");
		
		
		Student student1  =new Student();
		student1.setSname("Balaji");
		student1.setSfee(45000.00);
		student1.setBranch(branch);
		student1.setSpin("98743");
		
		
		Student student2  =new Student();
		student2.setSname("Balu");
		student2.setSfee(45000.00);
		student2.setBranch(branch);
		student2.setSpin("796423");
		
		studentRepositroy.saveAll(List.of(student,student1,student2));
		
//		branch.setStudents(List.of(student, student1, student2));
//		branchRepositroy.save(branch); 
		
		
//		List<Student> students=List.of(student, student1, student2);
//		branch.setStudents(students);
//		branchRepositroy.save(branch);
		
		
		
		
	}

}

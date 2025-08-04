package com.ciq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ciq.entity.Course;
import com.ciq.entity.Student;
import com.ciq.repository.CourseRepositroy;
import com.ciq.repository.StudentRepository;

@SpringBootApplication
public class SpringBootManyToManyWithCommandLineRunnerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootManyToManyWithCommandLineRunnerApplication.class, args);
	}
	
	@Autowired
	private CourseRepositroy courseRepositroy;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Course course = new Course();
		course.setCname("python");
		

		Course course1 = new Course();
		course1.setCname("core_java");

		Course course2 = new Course();
		course2.setCname("Advance_java");
		
		

		Student s1 = new Student();
		s1.setSname("Bhargav");
		s1.setSfee(450000.00);

		Student s2 = new Student();
		s2.setSname("Balaji");
		s2.setSfee(450000.00);

		Student s3 = new Student();
		s3.setSname("Bhagi");
		s3.setSfee(450000.00);

		Student s4 = new Student();
		s4.setSname("Bhagya");
		s4.setSfee(450000.00);

		Student s5 = new Student();
		s5.setSname("Bhagyam");
		s5.setSfee(450000.00);

		courseRepositroy.saveAll(List.of(course, course1, course2));

		List<Course> courses = List.of(course, course1, course2);

		s1.setCourse(courses);
		s2.setCourse(courses);
		s3.setCourse(courses);
		s4.setCourse(courses);
		s5.setCourse(courses);

//		studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);
//		studentRepository.save(s4);
//		studentRepository.save(s5);
		
		
		studentRepository.saveAll(List.of(s1, s2, s3,s4,s5));
		
		
		
	} 
}

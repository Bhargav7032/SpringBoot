package com.example.repositroy;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;

@Repository
public interface CouresRepositroy extends JpaRepository<Course, Integer> {
	
	 
	 

}

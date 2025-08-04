package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Student;

public interface StudentRepositroy extends JpaRepository<Student, Integer>{

}

package com.example.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository
public interface StudentRepositroy  extends JpaRepository<Student, Integer>{


}

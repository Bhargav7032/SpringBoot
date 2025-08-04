package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Course;

public interface CourseRepositroy extends JpaRepository<Course, Integer> {

}

package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Department;

public interface DepartmentRepositroy extends JpaRepository<Department, Integer>{

}

package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Employee;

public interface EmployeeRepositroy extends JpaRepository<Employee, Integer> {

}
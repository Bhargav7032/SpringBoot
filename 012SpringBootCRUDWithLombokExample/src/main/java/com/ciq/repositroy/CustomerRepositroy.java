package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Customer;

public interface CustomerRepositroy extends JpaRepository<Customer, Integer> {

}

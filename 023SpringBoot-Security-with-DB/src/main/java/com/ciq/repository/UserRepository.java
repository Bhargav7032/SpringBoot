package com.ciq.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUname(String uname);
}
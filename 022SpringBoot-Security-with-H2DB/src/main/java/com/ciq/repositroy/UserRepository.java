package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciq.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}

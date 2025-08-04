package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Profile;
import com.ciq.entity.User;

public interface UserRepositroy extends JpaRepository<User, Integer> {

}

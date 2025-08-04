package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Profile;

public interface ProfileRepositroy extends JpaRepository<Profile, Integer> {

}

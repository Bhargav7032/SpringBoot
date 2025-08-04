package com.ciq.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Branch;

public interface BranchRepositroy extends JpaRepository<Branch, Integer>{

}

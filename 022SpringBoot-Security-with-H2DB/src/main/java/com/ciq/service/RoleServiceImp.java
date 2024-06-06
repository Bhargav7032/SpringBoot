package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.RoleBean;
import com.ciq.entity.Role;
import com.ciq.mapper.RoleMapper;
import com.ciq.repositroy.RoleRepository;

@Service
public class RoleServiceImp implements RoleService {


	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role findById(int rid) {
		return roleRepository.findById(rid).get();
	}

	@Override
	public Role save(RoleBean roleBean) {
		Role role = RoleMapper.mapToRole(roleBean);
		return roleRepository.save(role);
	}

}
	


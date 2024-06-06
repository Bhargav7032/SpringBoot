package com.ciq.service;

import com.ciq.bean.RoleBean;
import com.ciq.entity.Role;

public interface RoleService {
	
	public Role save(RoleBean roleBean);
	
	public Role findById(int rid);
	

}
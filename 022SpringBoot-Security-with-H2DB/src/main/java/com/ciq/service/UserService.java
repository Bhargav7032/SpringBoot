package com.ciq.service;

import com.ciq.bean.UserBean;
import com.ciq.entity.User;

public interface UserService {
	
	User save(UserBean userBean);

	public User findById(int uid);

}
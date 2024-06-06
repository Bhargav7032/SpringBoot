package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.bean.RoleBean;
import com.ciq.bean.UserBean;
import com.ciq.entity.Role;
import com.ciq.entity.User;
import com.ciq.repositroy.RoleRepository;
import com.ciq.service.RoleService;
import com.ciq.service.UserService;
import com.ciq.service.UserServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest/roles")
@CrossOrigin("*")
public class Roleontroller {
	
	@Autowired
	private RoleService  roleService;
	
    @PostMapping
    public ResponseEntity<Role> addRole(@RequestBody RoleBean roleBean){
		return ResponseEntity.ok(roleService.save(roleBean));
    }
		
       @GetMapping("/{rid}")
		public  ResponseEntity<Role>  findbyid(@PathVariable int rid) {
			return ResponseEntity.ok(roleService.findById(rid));
    }
}

	

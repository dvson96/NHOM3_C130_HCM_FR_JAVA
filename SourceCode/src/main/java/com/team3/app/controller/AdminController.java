package com.team3.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team3.app.entities.AdminUsers;
import com.team3.app.repository.AdminUserRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminUserRepository repository;
	
	@RequestMapping("/all")
	List<AdminUsers> index(){
		return repository.findAll();
	}
	
}

package com.webservices.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.app.service.ServiceInterface;

@RestController
public class ControllerClass {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@GetMapping("/welcome")
	public String controllerClass() {
		return serviceInterface.print("Alex");
	}
}

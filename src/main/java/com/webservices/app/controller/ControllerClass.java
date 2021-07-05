package com.webservices.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.app.request.RequestBody;
import com.webservices.app.response.ResponseBody;
import com.webservices.app.service.ServiceInterface;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@PostMapping("/welcome/")
	public ResponseBody controller1Class(/* @PathVariable("name") */ RequestBody request) {
		return serviceInterface.print(request);
	}
	
	@GetMapping("/welcome/{id}")
	public ResponseBody controller2Class(@PathVariable("id") String id) {
		return serviceInterface.getCity(id);
	}
}

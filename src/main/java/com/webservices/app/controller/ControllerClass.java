package com.webservices.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/welcome/")
	public ResponseBody controllerClass(/* @PathVariable("name") */ RequestBody request) {
		return serviceInterface.print(request);
	}
}

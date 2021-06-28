package com.webservices.app.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass implements ServiceInterface{
	
	public String print(String name) {
		return "Hello " + name;
	}
}

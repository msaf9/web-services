package com.webservices.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.app.response.ResponseBody;
import com.webservices.app.service.ViewService;

@RestController
@RequestMapping("/api")
public class ViewController {

	@Autowired
	private ViewService viewService;

	@GetMapping("/cities")
	public List<ResponseBody> viewAllController(/* @PathVariable("id") String id */) {
		return viewService.getCity(/* id */);
	}

	@GetMapping("/city/{id}")
	public ResponseBody viewController(@PathVariable("id") int id) {
		return viewService.getOneCity(id);
	}
}

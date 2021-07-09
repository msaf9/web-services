package com.webservices.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webservices.app.response.ResponseBody;

@Service
public class ViewServiceImpl implements ViewService {

	@Override
	public List<ResponseBody> getCity(/*String id*/) {
		List<ResponseBody> cityList = extracted();
		return cityList;
	}

	private List<ResponseBody> extracted() {
		List<ResponseBody> cityList = new ArrayList<>();
		cityList.add(new ResponseBody("Alex", 0, "NYC"));
		cityList.add(new ResponseBody("Bob", 1, "SEA"));
		cityList.add(new ResponseBody("Sam", 2, "BS"));
		return cityList;
	}
	
	@Override
	public ResponseBody getOneCity(int id) {
		List<ResponseBody> cityList = extracted();
		ResponseBody city = new ResponseBody();
		city = cityList.get(id);
		return city;
	}
}

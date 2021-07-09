package com.webservices.app.service;

import java.util.List;

import com.webservices.app.response.ResponseBody;

public interface ViewService {

	List<ResponseBody> getCity(/* String id */);

	ResponseBody getOneCity(int id);

}

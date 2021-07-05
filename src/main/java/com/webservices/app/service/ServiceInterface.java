package com.webservices.app.service;

import com.webservices.app.request.RequestBody;
import com.webservices.app.response.ResponseBody;

public interface ServiceInterface {
	
	public ResponseBody print(RequestBody request);

	public ResponseBody getCity(String id);
}

package com.thg.service.impl;

import javax.jws.WebService;

import com.thg.service.HelloService;

@WebService(endpointInterface="com.thg.service.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String getName(String userId) {
		return "name is "+userId;
	}

}

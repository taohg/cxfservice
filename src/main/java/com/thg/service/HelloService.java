package com.thg.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloService {
	
	public String getName(@WebParam(name="userId", mode=WebParam.Mode.IN) String userId);
}

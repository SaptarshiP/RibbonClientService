package com.psja.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ApplicationController {
	
	@Value("${server.port}")
	private String port; 
	
	@RequestMapping(value = "/getData")
	public String getData() {
		return "Hi i am in this port:"+port;
	}
}

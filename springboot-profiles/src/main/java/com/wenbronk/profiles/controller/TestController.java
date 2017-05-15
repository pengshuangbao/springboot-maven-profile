package com.wenbronk.profiles.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="test")
	public String isConnect() {
		System.out.println("success connect");
		return "sucess connect";
	}
	
}

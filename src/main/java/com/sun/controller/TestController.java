package com.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testController")
public class TestController {

	@RequestMapping("sayHello")
	public String sayHello(){
		System.out.println("-------fffffff-----");
		return "helloty";
	}
}

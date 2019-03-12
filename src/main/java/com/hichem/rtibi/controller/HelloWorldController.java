package com.hichem.rtibi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	 @GetMapping(path = "/hello")
	//@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return "hello world";
	}

}

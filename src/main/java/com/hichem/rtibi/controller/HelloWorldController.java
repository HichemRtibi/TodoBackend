package com.hichem.rtibi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path = "/hello")
	// @RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return "hello world";
	}

	@GetMapping(path = "/hello-bean")
	public HelloBean HelloBean() {
		return new HelloBean("hello world -Bean");
	}

	@GetMapping(path = "/hello-bean/path-variable/{name}")
	public HelloBean HelloBeanPathVariable(@PathVariable String name) {
		return new HelloBean(String.format("hello ,%s", name));
	}

}

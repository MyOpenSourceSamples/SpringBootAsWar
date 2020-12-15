package com.demo.springbootaswar.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBAWRestController 
{
	@GetMapping("/hello")
	public String respondHello()
	{
		return "Hello World";
	}
}

package com.jdbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/test")
	public String test() {
		return "Server is up and running!!";
	}
	
}

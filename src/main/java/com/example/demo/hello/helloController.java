package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {

	@GetMapping("/hello")
	public String showHello() {
		return "/hello";
	}
}

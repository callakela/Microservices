package com.example.demo1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@PostMapping("bye/{name}")
	public String bye(@PathVariable ("name") String name) {
		return "Bye Bye : "+name;
	}
	
	@RequestMapping("hello/{name}")
	public String greet(@PathVariable ("name") String name) {
		return "Hello :"+name;
	}

}

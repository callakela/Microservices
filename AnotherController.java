package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	@GetMapping("/temperature")
	public String getTemp(@RequestParam("cityName") String cityName) {
		
		return "Temprature of "+cityName+" Id "+Math.random()*100;
		
	}
}

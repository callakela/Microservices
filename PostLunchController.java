package com.example.demo1;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostLunchController {

	@Autowired
	private List<String> menu;
	
	
	public String printHotelInformation(HotelInformation hotelInformation) {
		return null;
		//return comma separated output;
	}
	
	@GetMapping("/hotel")
	public HotelInformation getHotelInformation() {
		HotelInformation hotelInformation = new HotelInformation();
		hotelInformation.setName("Kothas Coffee");
		hotelInformation.setCity("Bangalore");
		hotelInformation.setBranches(Arrays.asList("Richmond", "E City", "Whitefield"));
		return hotelInformation;
	}
	
	@GetMapping("/menu")
	public List<String> getMenu() {
		return menu;
	}
}
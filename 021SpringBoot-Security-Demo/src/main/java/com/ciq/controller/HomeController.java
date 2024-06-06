package com.ciq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "HOME";

	}

	@GetMapping("/about")
	public String about() {
		return "ABOUT";

	}

	@GetMapping("/private/findAll")
	public String privateHome() {
		return "PRIVATE HoMe";
	}

	@GetMapping("/private/findById")
	public String privateabout() {
		return "PRIVATE ABOUT";

	}

	@GetMapping("/admin")
	public String admin() {
		return "ADMIN";

	}
}
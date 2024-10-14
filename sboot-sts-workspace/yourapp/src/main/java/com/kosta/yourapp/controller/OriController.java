package com.kosta.yourapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OriController {
	@GetMapping("/ori")
	public String ori() {
		return "index";
	}
	 
}

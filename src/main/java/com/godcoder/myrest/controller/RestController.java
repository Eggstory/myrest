package com.godcoder.myrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
	
	@GetMapping
	public String index() {
		return "index";
	}

}

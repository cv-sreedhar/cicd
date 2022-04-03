package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Greetingmvccontroller {

	@GetMapping("/greeting")
	public String greeting(Model model) {
		
		model.addAttribute("name", "Sreedhar");
			
		return "hello";
		
	}
}

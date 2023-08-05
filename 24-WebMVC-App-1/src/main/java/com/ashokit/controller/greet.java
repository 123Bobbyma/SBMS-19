package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greet {
   
	@GetMapping("/greet")
	public String getGreestMsg(Model model) {
		
		String msgtxt = "good morning";
		
		model.addAttribute("msg", msgtxt);
		
		return "greet";
	}
}

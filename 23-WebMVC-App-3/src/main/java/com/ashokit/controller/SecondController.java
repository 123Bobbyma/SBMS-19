package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","hey good morning by my side ....");
		mav.setViewName("greet");
		return mav;
	}
	
}

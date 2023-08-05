package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	
	@GetMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "WLCOME TO HOME PAGE OF WEBAPP-1");
		mav.setViewName("home");
		return mav;
	}
}

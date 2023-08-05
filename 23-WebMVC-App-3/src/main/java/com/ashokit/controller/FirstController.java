package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView getMsg() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","welcome to sbms");
		mav.setViewName("index");
		return mav;

	}
}

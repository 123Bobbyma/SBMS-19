package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		User user = new User();
		
		model.addAttribute("user", user);
		
		
		return "index";
	}
	@PostMapping("/register")
	public String handleRegister(@Valid  User userForm,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
		
		System.out.println(userForm);
		model.addAttribute("msg", "your registration successfull...");
		return "success";
		
	}

}

package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.Student;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@Controller
public class StudentController {

	@GetMapping("/")
	public String generateForm(Model model) {
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "index";
	}
	
	@PostMapping("/register")
	public String formHandler( @Valid Student studentForm ,BindingResult result,  Model model ) {
		
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(studentForm);
		
		model.addAttribute("msg", "your registration successfull...");
		
		return "success";
	}
}

package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.Products;

import jakarta.annotation.PostConstruct;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getProductForm(Model model) {
		
		Products product = new Products();
		
		model.addAttribute("product", product);
		
		return "index";
	}
	
	@PostMapping("/product")
	public String handleFormSubmit(Products product, Model model) {
		
		System.out.println(product);
		
		model.addAttribute("msg", "product saved successfully...");
		
		return "success";
	}
}

package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.binding.Book;

@Controller
public class BookController {
 
	@GetMapping("/")
	public String displayForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "index";
	}
}

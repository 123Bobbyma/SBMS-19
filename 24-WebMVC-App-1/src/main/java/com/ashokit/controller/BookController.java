package com.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
 public String getBookData(Model model) {
	 
		//setting data to binding obj
	 Book bookobj = new Book(101,"spring", 450.00);
	 
	 model.addAttribute("book", bookobj);
	 
	 //retun view name
	 return "book";
 }
	@GetMapping("/books")
	public String getBooksData(Model model) {
		
		Book b1 = new Book(101,"spring", 450.00);
		Book b2 = new Book(102,"java", 400.00);
        Book b3 = new Book(103,"HTMLand CSS", 300.00);
		Book b4 = new Book(104,"HIBERNATE", 500.00);

		List<Book> list = Arrays.asList(b1,b2,b3,b4);
		
		model.addAttribute("books", list);
		
		return "books";		
	}
}

package com.ashokit.rest;

import java.net.ResponseCache;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name){
		
		String resbody = name+" price is 400 rs. ";
		
		return new ResponseEntity<String>(resbody, HttpStatus.OK);
	}
	
	@GetMapping("/book/{name}/{author}")
	public ResponseEntity<String> getBook(@PathVariable("name")String name,@PathVariable("author ") String author){
		
		String resbody = name + " By "+author+" is out of stock";
		
		return new ResponseEntity<String>(resbody, HttpStatus.OK);
		}

}

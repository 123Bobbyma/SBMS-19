package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseDteials( @RequestParam("cname") String cname,@RequestParam("ctrainer") String ctrainer){
		String resbody =cname +" By " + ctrainer +" fees is 7000 inr";
		
		return new ResponseEntity<String>(resbody, HttpStatus.OK);
	}
}

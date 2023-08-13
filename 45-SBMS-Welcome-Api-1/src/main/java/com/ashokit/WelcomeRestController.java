package com.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcome() {
		String msg ="welcome to ashok it";
		return msg;
	}
}

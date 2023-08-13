package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	public WelcomeApiClient apiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg="Good Morning " ;
	
      	String welcomeMsg = apiClient.invokeWelcome();
	    return greetMsg + welcomeMsg ;
	}
}

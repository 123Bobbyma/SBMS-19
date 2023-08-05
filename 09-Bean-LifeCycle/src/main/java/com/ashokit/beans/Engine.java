package com.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
	
	public Engine() {
		System.out.println(":engine:: constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("engine started...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("engine stoped...");
	}
}

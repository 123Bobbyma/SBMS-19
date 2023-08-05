package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ReportService;

@SpringBootApplication
public class Application {
  
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ReportService reportService = context.getBean(ReportService.class);

		reportService.generateDao();

	}


}

package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.Entity.Product;
import com.ashokit.repo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    
		ProductRepository repository = context.getBean(ProductRepository.class);
	    
		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("mouse");
		p1.setPrice(500.33
				);
		
		repository.save(p1);
	}

}

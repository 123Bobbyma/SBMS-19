package com.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ashokit.Entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*User u5 = new User(105,"Ganesh","Male",33,"India");
		  User u6 = new User(106,"Mac","Male",34,"SA");
		User u7 = new User(107,"Saina","Female",35,"NIGERA");
		User u8 = new User(108,"Aaradhya","Female",26,"India");
		User u9 = new User(109,"Butler","Male",33,"Aus");
		User u10 = new User(110,"Finch","Female",38,"Canada");

		userRepository.saveAll(Arrays.asList(u5,u6,u7,u8,u9,u10));
	 	*/
		
		
		//List<User> users = userRepository.findAll(Sort.by("age").descending());
		int pageSize = 5 ;
		int pageNo = 0;
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<User> page = userRepository.findAll(pageRequest);
	    List<User> users = page.getContent();
	    users.forEach(user -> {
			System.out.println(user);
		});
		
		
		
		
		
		
	}

}

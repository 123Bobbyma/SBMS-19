package com.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.Entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*User u1 = new User(101,"kapil","male", 25, "india");
	    User u2 = new User(102,"shriram","male", 29, "canada");
	    User u3 = new User(103,"bobby","male", 25, "india");
	    User u4 = new User(104,"kajal","female", 22, "USA+A");
	    
	    userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
	    
	    System.out.println("record successfully done ....."); */

 /* userRepository.saveAll(Arrays.asList(u2,u3,u4)); //upsert method insertion + update     
	    Optional<User> findById = userRepository.findById(102);
	    System.out.println("record successfully done ....."); 
	    if(findById.isPresent()) {
	    System.out.println(findById.get());
	    }
    Iterable<User> allById = userRepository.findAllById(Arrays.asList(101,102,103));

	      Iterable<User> findAll = userRepository.findAll();  
	    findAll.forEach(user-> {
	    	System.out.println(user);
	    });*/

		/* if(  userRepository.existsById(104)) { 
			 userRepository.deleteById(104);
			 System.out.println("record successfully delete");
		 }else {
			 System.out.println("record not foumd....");
		 }*/
		 
//        List<User> findbycountry =  userRepository.findByCountry("INDIA");
//        
//        findbycountry.forEach(user ->{
//        System.out.println(user);
//        });
//        
//        List<User> findByAge = userRepository.findByAge(25);
//        findByAge.forEach(user -> {
//        	System.out.println(user);
//        });
		
//		List<User> lis  t = userRepository.findByAgeGreaterThanEqual(26);
//		list.forEach(user -> {
//			System.out.println(user);
//		});
		
//		List<User> findByCountry = userRepository.findByCountryAndAge("INDIA", 25);
//		findByCountry.forEach(user-> {
//			System.out.println(user);
//		});
		
		List<User> allUsersHql = userRepository.getAllUsersHql();
		allUsersHql.forEach(user-> {
			System.out.println(user);
		});
		System.out.println("****************************************");
		
		List<User> allUserSql = userRepository.getAllUserSql();
		allUserSql.forEach(user -> {
			System.out.println(user );
		});
	}

}

package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Players;
import com.ashokit.repository.PlayerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	    PlayerRepo playerRepo = context.getBean(PlayerRepo.class);
	       
	    System.out.println(playerRepo.getClass().getName());
	
	    Players p1 = new Players();
	    p1.setPlayerId(102);
	    p1.setPlayerName("sehwag");
	    p1.setPlayerAge(46);
	    p1.setLocation("delhi");
	     
	    playerRepo.save(p1); //upsert method
	    
	    System.out.println("record inserted.....");
	}

}

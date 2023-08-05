package com.ashokit.services;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.User;
import com.ashokit.repo.UserRepo;

@Service
public class UserService {
	
	private UserRepo userRepo;

	@Autowired
	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
   public void saveUser() throws Exception {	
	   
	   String imagePath= "C:\\Users\\HP\\OneDrive\\Desktop\\photo-1533450718592-29d45635f0a9 (1).jpeg";
	   
	   User u1 = new User();
	   u1.setUserId(101);
	   u1.setUserName("bobby");
	   u1.setUserEmail("bobby@gmail.com");
	   
	   long size = Files.size(Paths.get(imagePath));
	   
	   byte[] arr = new byte[(int) size];
	   FileInputStream fis = new FileInputStream(new File(imagePath));
	   fis.read(arr);
	   fis.close();
	   
	   u1.setUserImage(arr);
	   userRepo.save(u1);
	   
   }

}

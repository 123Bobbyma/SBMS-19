package com.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
 
	@Query(value = "From User")
	 public List<User> getAllUsersHql();
	 
	@Query(value = "select * from USER_MASTER" , nativeQuery = true)
	 public List<User> getAllUserSql();

 }

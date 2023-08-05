package com.ashokit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Players;

@Repository
public interface PlayerRepo extends CrudRepository<Players, Integer> {

	
	
}

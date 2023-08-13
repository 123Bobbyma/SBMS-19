package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.ashokit.enitity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable> {

}

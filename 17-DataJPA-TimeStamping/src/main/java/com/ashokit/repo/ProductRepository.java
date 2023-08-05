package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

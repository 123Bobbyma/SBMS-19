package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CustomerInfo;

public interface CustomerRepository extends JpaRepository<CustomerInfo, Serializable>{

}

package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.CustomerInfo;
import com.ashokit.service.CustmoerService;

@RestController
public class CustomerRestController {
    
	@Autowired
	private CustmoerService service;
	
	@PostMapping("/addcustomer")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerInfo customerInfo){
	     String customer = service.upsertCustomer(customerInfo);	
	     return new ResponseEntity<String>(customer,HttpStatus.CREATED);
	}
	
	@GetMapping("/getcustomer")
	public ResponseEntity<List<CustomerInfo>> getAllCustomer(){
	    List<CustomerInfo> allCustomer = service.getAllCustomer();	
	
	     return new ResponseEntity<List<CustomerInfo>>(allCustomer,HttpStatus.OK);
	
	}
	@PutMapping("/updatecustomer")
	public ResponseEntity<String> updateCustomer(@RequestBody CustomerInfo customerInfo){
	  String upsertCustomer = service.upsertCustomer(customerInfo); 	
       return new ResponseEntity<>(upsertCustomer, HttpStatus.OK);	
	}
	@DeleteMapping("/deletecustomer/{custId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer custId){
		String deleteCustomer = service.deleteCustomer(custId);
	    return new ResponseEntity<String>(deleteCustomer, HttpStatus.OK);
	}
	
}

package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.CustomerInfo;
import com.ashokit.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustmoerService{

	private CustomerRepository repo;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.repo=customerRepository;	
	}
	@Override
	public String upsertCustomer(CustomerInfo customerInfo) {
		Integer custId = customerInfo.getCustId();
		repo.save(customerInfo);
		if(custId == null) {
			return "Record Inserted";
		}else {
			return "Record Updated";
		}
	}

	@Override
	public List<CustomerInfo> getAllCustomer() {
		return    repo.findAll();

	}

	@Override
	public String deleteCustomer(Integer custId) {
		repo.deleteById(custId);
		return "Customer Deleted";
	}


}

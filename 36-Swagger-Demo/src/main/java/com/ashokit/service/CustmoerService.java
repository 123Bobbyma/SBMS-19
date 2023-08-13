package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.CustomerInfo;

public interface CustmoerService {

	public String upsertCustomer(CustomerInfo customerInfo);
	
	public List<CustomerInfo> getAllCustomer();
	
	public String deleteCustomer(Integer custId);
}

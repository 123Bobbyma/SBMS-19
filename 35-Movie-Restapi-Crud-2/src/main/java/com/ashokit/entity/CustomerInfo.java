package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CUST_DTLS")
public class CustomerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Integer custId;
	@Column(name = "CUSTOMER_NAME")
	private String custName;
	@Column(name = "CUSTOMER_AGE")
	private String custAge;
	@Column(name = "CUSTOMER_EMAIL")
	private String custEmail;
	@Column(name = "CUSTOMER_MOBILE")
	private long custMobile;
}

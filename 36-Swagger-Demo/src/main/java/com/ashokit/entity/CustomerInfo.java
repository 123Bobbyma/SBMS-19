package com.ashokit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity
@Table(name = "CUST_DTLS")
@XmlRootElement
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
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAge() {
		return custAge;
	}
	public void setCustAge(String custAge) {
		this.custAge = custAge;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public long getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
	
	
}

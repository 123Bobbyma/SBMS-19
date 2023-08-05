package com.ashokit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_MASTER")
public class User {
	
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_USERNAME")
	private String username;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_AGE")
	private Integer age ;
	
	@Column(name="USER_COUNTRY")
	private String country;

}

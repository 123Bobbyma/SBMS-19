package com.ashokit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

	public User(Integer userId, String username, String gender, Integer age, String country) {
		super();
		this.userId = userId;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", gender=" + gender + ", age=" + age
				+ ", country=" + country + "]";
	}
	
	

}

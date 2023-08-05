package com.ashokit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max.List;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {

	@NotEmpty(message = "username is mandatory")
	private String userName;
	
	@NotEmpty(message = "password is mandatory")
	private String pwd;
	
	@NotEmpty(message = "email is mandatory")
	@Email(message = "enter valid email id ")
	private String email;
	
	@NotEmpty(message = "phone is mandatory")
	private String phone;
	
	@NotNull(message = "age is mandatory")
	private Integer age ;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String pwd, String email, String phone, Integer age) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}
	
	
}

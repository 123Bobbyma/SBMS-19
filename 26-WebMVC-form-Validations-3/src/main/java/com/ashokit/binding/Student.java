package com.ashokit.binding;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Student {

	@NotEmpty(message = " Name Field is required")
	private String sName;
	private String sCourse;
	private Integer sAge;
	private String sEmail;
	private String sPhone;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sName, String sCourse, Integer sAge, String sEmail, String sPhone) {
		super();
		this.sName = sName;
		this.sCourse = sCourse;
		this.sAge = sAge;
		this.sEmail = sEmail;
		this.sPhone = sPhone;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sCourse=" + sCourse + ", sAge=" + sAge + ", sEmail=" + sEmail
				+ ", sPhone=" + sPhone + "]";
	}
	
	
	
}

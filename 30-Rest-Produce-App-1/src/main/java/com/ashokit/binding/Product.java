package com.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
public class Product {

	
	private Integer pId;
	 private String pName;
	 private String pPrice;
	 
	 public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	public Product(Integer pId, String pName, String pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	 
	 
}

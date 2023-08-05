package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="BANK_ACCOUNTS")
public class Account {
	
	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name ="MIN_BAL")
	private Integer minBal;
	
	@EmbeddedId
	private AccountPK accPk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getMinBal() {
		return minBal;
	}

	public void setMinBal(Integer minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccPk() {
		return accPk;
	}

	public void setAccPk(AccountPK accPk) {
		this.accPk = accPk;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accPk=" + accPk + "]";
	}
	
	

}

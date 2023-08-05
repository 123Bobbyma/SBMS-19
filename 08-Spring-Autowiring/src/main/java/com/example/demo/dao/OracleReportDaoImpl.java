 package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao{
	
	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl:: construcotr");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data form oracle db...");
		return "report data";
	}

}

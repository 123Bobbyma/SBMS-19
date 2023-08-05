package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDaoImpl implements ReportDao {
	
	public MysqlReportDaoImpl() {
		System.out.println("mysqlreportdaoimpl:: construcotr");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data form mysql db...");
		return "report data";
	}
	
	

}

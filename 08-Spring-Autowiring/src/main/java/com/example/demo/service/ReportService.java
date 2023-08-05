package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReportDao;

@Service 
public class ReportService {
	
	private ReportDao reportdao ;
	
	@Autowired
	@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setreportdao method called");
		this.reportdao= reportDao; 
	}
	
	public void generateDao() {
		String findData = reportdao.findData();
		System.out.println("generating report...");
	}

}

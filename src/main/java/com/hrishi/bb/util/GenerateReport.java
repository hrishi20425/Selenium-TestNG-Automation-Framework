package com.hrishi.bb.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateReport {
	
	static ExtentSparkReporter reporter;
	static ExtentReports extent;
	final static String report_path = System.getProperty("user.dir")+"//Reports//index.html";
	
	public static ExtentReports getExtentReport()
	{
		reporter = new ExtentSparkReporter(report_path);
		reporter.config().setReportName("Hrishi.com Automation Results");
		reporter.config().setDocumentTitle("Automation ReportCard");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
					
	}
	

}

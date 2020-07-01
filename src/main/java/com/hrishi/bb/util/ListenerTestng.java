package com.hrishi.bb.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.hrishi.bb.base.WebDriverManager;

public class ListenerTestng extends WebDriverManager implements ITestListener {

	ExtentReports extent = GenerateReport.getExtentReport();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);

	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, result.getMethod().getMethodName() + "Test case is passed");
		CaptureScreenshot.getScreenshot(driver, result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		String screenshotpath = CaptureScreenshot.getScreenshot(driver, result.getMethod().getMethodName());
		extentTest.get().log(Status.FAIL, result.getThrowable());
		try {
			extentTest.get().log(Status.FAIL, "screenshot below:"+extentTest.get().addScreenCaptureFromPath(screenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test case is skipped");
		
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}

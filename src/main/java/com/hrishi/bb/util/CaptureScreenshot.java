package com.hrishi.bb.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {
	static String screenshotpath = System.getProperty("user.dir")+"//Screenshots";
	public static String getScreenshot(WebDriver driver, String testcasename)
	{
		File from = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dobj = new Date();
		File dest = new File(screenshotpath+"//"+testcasename+".png");
		try {
			Files.copy(from, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest.getPath();
	}
}

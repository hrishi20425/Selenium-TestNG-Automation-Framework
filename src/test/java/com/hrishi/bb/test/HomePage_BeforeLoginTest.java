package com.hrishi.bb.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrishi.bb.base.WebDriverManager;
import com.hrishi.bb.pageObjects.AuthenticationPage;
import com.hrishi.bb.pageObjects.HomePage_BeforeLogin;
import com.hrishi.bb.util.Log;

public class HomePage_BeforeLoginTest extends WebDriverManager{
	
	HomePage_BeforeLogin home_bl_page;
	AuthenticationPage Auth_page;
	@BeforeMethod
	public void setUp()
	{
		//Log.setUp();
		initializeDriver();
		home_bl_page = new HomePage_BeforeLogin();
		PageFactory.initElements(driver, home_bl_page);
	}
	
	@Test(priority =1)
	public void TC_home_01()
	{
		Log.startofTestCase("TC_home_01");
		String title = home_bl_page.getTitle();
		Assert.assertEquals(title, "My Store");
		Log.endofTestCase("TC_home_01");
	}
	
	@Test(priority =2)
	public void TC_home_02()
	{
		Log.startofTestCase("TC_home_02");
		Auth_page = home_bl_page.signin_click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - 9My Store");
		Log.endofTestCase("TC_home_02");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

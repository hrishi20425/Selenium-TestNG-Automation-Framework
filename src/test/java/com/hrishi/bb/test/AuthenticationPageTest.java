package com.hrishi.bb.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrishi.bb.base.WebDriverManager;
import com.hrishi.bb.pageObjects.AuthenticationPage;
import com.hrishi.bb.pageObjects.CreateAccountPage;
import com.hrishi.bb.pageObjects.HomePage_BeforeLogin;

public class AuthenticationPageTest extends WebDriverManager {
	HomePage_BeforeLogin home_bl_page;
	AuthenticationPage Auth_page;
	CreateAccountPage createacct_page;
	
	@BeforeMethod
	public void setUp() {
		initializeDriver();
		home_bl_page = new HomePage_BeforeLogin();
		Auth_page = home_bl_page.signin_click();
	}
	
	@Test
	public void TC_auth_01()
	{
		createacct_page = Auth_page.create_account();
		String heading = createacct_page.getHeading();
		Assert.assertEquals(heading, "AUTHENTICATION");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

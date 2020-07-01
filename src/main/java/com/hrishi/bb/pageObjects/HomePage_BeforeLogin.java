package com.hrishi.bb.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrishi.bb.base.WebDriverManager;

public class HomePage_BeforeLogin extends WebDriverManager{
	
	@FindBy(className ="login")
	WebElement btn_Sign;
	

	public HomePage_BeforeLogin()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public AuthenticationPage signin_click()
	{
		btn_Sign.click();
		return new AuthenticationPage();
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
}

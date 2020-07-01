package com.hrishi.bb.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrishi.bb.base.WebDriverManager;

public class AuthenticationPage extends WebDriverManager{
	
	@FindBy(id="email_create")
	WebElement txtbox_emailaddr;
	
	@FindBy(id="SubmitCreate")
	WebElement btn_creataccnt;
	
	@FindBy(id="email")
	WebElement txtbox_loginemail;
	
	@FindBy(id="passwd")
	WebElement txtbox_pwd;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_signin;
	
	AuthenticationPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public CreateAccountPage create_account()
	{
		txtbox_emailaddr.sendKeys("hrishi204253@gmail.com");
		btn_creataccnt.click();
		return new CreateAccountPage();
	}
	
	public void signin()
	{
		txtbox_loginemail.sendKeys("hrishi204253@gmail.com");
		txtbox_pwd.sendKeys("Ganesh-123");
		btn_signin.click();
	}

}

package com.hrishi.bb.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrishi.bb.base.WebDriverManager;

public class CreateAccountPage extends WebDriverManager{
	
	@FindBy(className="page-heading")
	public WebElement lbl_heading;
	
	@FindBy(id="id_gender1")
	public WebElement chkbx_title_Mr;
	
	@FindBy(id="id_gender2")
	public WebElement chkbx_title_Mrs;
	
	@FindBy(id="customer_firstname")
	public WebElement txtbx_firstname;
	
	@FindBy(id="customer_lastname")
	public WebElement txtbx_lastname;
	
	@FindBy(id="passwd")
	public WebElement txtbx_passwd;
	
	@FindBy(id="firstname")
	public WebElement txbx_addr_firstname;
	
	@FindBy(id="lastname")
	public WebElement txbx_addr_lastname;
	
	@FindBy(id="address1")
	public WebElement txtbx_address1;
	
	@FindBy(id="city")
	public WebElement txtbx_city;
	
	@FindBy(id="id_state")
	public WebElement drpdwn_state;

	@FindBy(id="postcode")
	public WebElement txtbx_postcode;

	@FindBy(id="phone_mobile")
	public WebElement txtbx_mobile;
	
	@FindBy(id="alias")
	public WebElement txtbx_addr_alias;
	
	@FindBy(id="submitAccount")
	public WebElement btn_register;
	
	CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getHeading()
	{
		return lbl_heading.getText();
	}

}
 	
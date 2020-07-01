package com.hrishi.bb.test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrishi.bb.base.WebDriverManager;
import com.hrishi.bb.pageObjects.AuthenticationPage;
import com.hrishi.bb.pageObjects.CreateAccountPage;
import com.hrishi.bb.pageObjects.HomePage_BeforeLogin;
import com.hrishi.bb.util.ReadExcelTestData;

public class CreateAccountPageTest extends WebDriverManager{

	HomePage_BeforeLogin Home_bl_page;
	AuthenticationPage Auth_page;
	CreateAccountPage create_acct_page;
		
	@BeforeMethod
	public void setUp()
	{
		driver = initializeDriver();
		Home_bl_page = new HomePage_BeforeLogin();
		Auth_page = Home_bl_page.signin_click();
		create_acct_page = Auth_page.create_account();
	}
	
	@Test(dataProvider ="get_account_data")
	public void TC_create_acct_01(String name, String surname, 
			String pwd, String addr_name, String addr_lastname, String addr1, 
			String city, String state, String postcode, String mobile, String addr_alias)
	{
		create_acct_page.chkbx_title_Mr.click();
		create_acct_page.txtbx_firstname.sendKeys(name);
		create_acct_page.txtbx_lastname.sendKeys(surname);
		create_acct_page.txtbx_passwd.sendKeys(pwd);
		create_acct_page.txbx_addr_firstname.sendKeys(addr_name);
		create_acct_page.txbx_addr_lastname.sendKeys(addr_lastname);
		create_acct_page.txtbx_address1.sendKeys(addr1);
		create_acct_page.txtbx_city.sendKeys(city);
		Select state_option = new Select(create_acct_page.drpdwn_state);
		state_option.selectByVisibleText(state);
		create_acct_page.txtbx_postcode.sendKeys(postcode);
		create_acct_page.txtbx_mobile.sendKeys(mobile);
		create_acct_page.txtbx_addr_alias.sendKeys(addr_alias);
		create_acct_page.btn_register.click();
	}
	
	@DataProvider
	public Object[][] get_account_data()
	{
		String sheetname = "CreateAccountPage";
		return ReadExcelTestData.readData(sheetname);
		
	}
	
}

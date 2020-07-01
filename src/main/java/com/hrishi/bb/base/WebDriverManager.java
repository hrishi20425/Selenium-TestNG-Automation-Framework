package com.hrishi.bb.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.hrishi.bb.config.ConfigManager;
import com.hrishi.bb.util.WebdriverListener;

public class WebDriverManager extends ConfigManager{
	public static WebDriver driver;	
	public WebDriver initializeDriver()
	{
		if(configproperties.getProperty("browser").equalsIgnoreCase("chrome"))
		System.setProperty("webdriver.chrome.driver", configproperties.getProperty("driverpath"));
		driver = new ChromeDriver();
		EventFiringWebDriver event_driver = new EventFiringWebDriver(driver);
		WebdriverListener event_listner = new WebdriverListener();
		driver = event_driver.register(event_listner);
		driver.manage().deleteAllCookies();
		driver.get(configproperties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
	return driver;
	}

}

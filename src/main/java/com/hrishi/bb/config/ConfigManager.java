package com.hrishi.bb.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	public static Properties configproperties;
	
	public ConfigManager()
	{
		configproperties = new Properties();
		FileInputStream configfile = null;
		try {
			configfile = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//hrishi//bb//config//config.properties");
		} catch (FileNotFoundException e) {
			System.out.println("Config file not found"+e.getMessage());
			
		}
		try {
			configproperties.load(configfile);
		} catch (IOException e) {
			System.out.println("Config file cannot be loaded"+e.getMessage());
		}
		
	}
	
	
	
}

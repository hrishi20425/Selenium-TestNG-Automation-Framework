package com.hrishi.bb.util;

import org.apache.log4j.Logger;

public class Log {

	static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void setUp()
	{
		log.info("                                                                                                      "+"\n"
				+ "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+"\n"
				+ "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+"\n"
				+ "=============================This is a set up before start of test case  ============================"+"\n");
	}

	public static void startofTestCase(String testcasename)
	{
		log.info("============This is a start of test case "+testcasename+ " =================="+"\n");
	}
	
	public static void endofTestCase(String testcasename)
	{
		log.info("                                                                                                      "+"\n"
				+ "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+"\n"
				+ "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+"\n"
				+ "=============================This is end of test case "+testcasename+ " ============================="+"\n");
	}
	
	 public static void info(String message) {
		 
		 log.info(message);
		 
		 }
		 
		 public static void warn(String message) {
		 
			 log.warn(message);
		 
		 }
		 
		 public static void error(String message) {
		 
			 log.error(message);
		 
		 }
		 
		 public static void fatal(String message) {
		 
			 log.fatal(message);
		 
		 }
		 
		 public static void debug(String message) {
		 
			 log.debug(message);
		 
		 }

}

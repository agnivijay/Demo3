package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_class {
//Factory Design
	public static Logger log=Logger.getLogger(Logger_class.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		log.debug("Debug");
		log.info("INFO");
		log.warn("WARN");
		log.debug("Debug");
		log.error("ERROR");
		log.fatal("FATAL");
	}
	
}

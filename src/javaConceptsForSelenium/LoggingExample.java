package javaConceptsForSelenium;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggingExample {

	static Logger logger = Logger.getLogger(LoggingExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Configurator declaration - Basic
		//BasicConfigurator.configure();
		
		//PropertyConfigurator.configure("log4j.properties");
		
		DOMConfigurator.configure("log4j.xml");
		
		//Log messages
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Waring message");
		logger.error("Error message");
		logger.fatal("Fatel message");
		
	}
	

}

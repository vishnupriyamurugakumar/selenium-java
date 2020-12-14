package javaConceptsForSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithConfigFileReadHelp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
			System.out.println("Mentioned driver is not present so we are running in default browser");
		}
		
		driver.get("http://www.google.co.in");
	}

}

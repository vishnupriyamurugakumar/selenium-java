package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpenGoogle {
	public static void main(String[] args) {
		
		//Set broswer 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vishnu\\geckodriver\\geckodriver.exe");
		
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Google
		driver.get("http://www.google.co.in");
		
	}

}

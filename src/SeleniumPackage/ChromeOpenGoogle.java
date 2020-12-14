package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeOpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		
		// Launch browser
		WebDriver driver = new ChromeDriver();
		
		// Open google page
		driver.get("http://www.google.co.in");
		
		// Close google page
		driver.quit();

	}
}

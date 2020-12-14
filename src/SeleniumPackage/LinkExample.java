package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Agni"+Keys.ENTER);
		
		// Find by Entire link
		WebElement fullLink = driver.findElement(By.linkText("News"));
		fullLink.click();
		
		// Find by Partial link
		WebElement partialLink = driver.findElement(By.partialLinkText("age"));
		partialLink.click();
		
		
	}

}

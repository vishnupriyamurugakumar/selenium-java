package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");		
		
		//Set date using sendKeys
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("12/12/2020"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		//Set date using clicking on date
		datepicker.clear();
		datepicker.click();
		WebElement tenDate = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		tenDate.click();
		
		
		

	}

}

package SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//Accept in Normal Alert Box
		WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertButton.click();
		
		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();

		//Dismiss in Confirmation Alert Box
		WebElement confirmAlertButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmAlertButton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Dismiss in Confirmation Alert Box
		WebElement promptAlertButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptAlertButton.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Testing");
		promptAlert.accept();
		
	}

}

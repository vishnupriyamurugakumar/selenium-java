package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");	
		
		//Get Text box and enter s keyword
		WebElement textBox = driver.findElement(By.id("tags"));
		textBox.sendKeys("s");
		
		// Explicit wait to get suggestions
		Thread.sleep(4000);
		
		// Select Web Services option from suggestions
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]//li"));
		
		for (WebElement webElement : suggestions) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println(" Web Services Found and selected");
				break;
			}
			
		}
		

	}

}

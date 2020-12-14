package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");	
		
		// 1. Click link
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		
		//Thread.sleep(3000);
		driver.navigate().back();
		
		// 2. Find where to go link without clicking
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String where = link2.getAttribute("href");
		System.out.println(where);
		
		// 3. Check Broken or not
		WebElement link3 = driver.findElement(By.linkText("Verify am I broken?"));
		link3.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Broken");
		}else {
			System.out.println("Not Broken");
		}
		
		driver.navigate().back();
		
		// 4. Interact with same link (again get element otherwise Stale Element Reference Exception thrown)
		WebElement link4 = driver.findElement(By.linkText("Go to Home Page"));
		link4.click();
		
		//Thread.sleep(3000);
		driver.navigate().back();
		
		// 5.Find number of links in page
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int linkCount = totalLinks.size();
		System.out.println(linkCount);

	}

}

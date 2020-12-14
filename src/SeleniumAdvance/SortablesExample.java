package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		//Drag and Drop the element as reverse order		
		Actions action = new Actions(driver);
		for (int i = 0; i < 6; i++) {
			List<WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"sortable\"]//li"));
			
			WebElement source = allelements.get(6);
			WebElement target = allelements.get(i);
			
			action.dragAndDrop(source, target).build().perform();
		}
		System.out.println("Done");

	}
	

}

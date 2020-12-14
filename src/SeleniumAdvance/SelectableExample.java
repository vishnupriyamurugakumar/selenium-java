package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//To Get all elements in Selectable element
		List<WebElement> selectableOptions = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
	// To perform 3 options click(Multiselect)
		Actions actions = new Actions(driver);
		
		// Way 1 press control and click 
		//actions.keyDown(Keys.CONTROL).click(selectableOptions.get(0)).click(selectableOptions.get(1))
		//.click(selectableOptions.get(2)).build().perform();
		
		// Way 2 click and hold
		actions.clickAndHold(selectableOptions.get(0));
		actions.clickAndHold(selectableOptions.get(1));
		actions.clickAndHold(selectableOptions.get(2)).build().perform();;
		
	}

}

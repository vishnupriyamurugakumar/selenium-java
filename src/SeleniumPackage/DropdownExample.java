package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//Select Dropdown value by using index
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select selection1 = new Select(dropDown1);
		selection1.selectByIndex(1);
	
		//Select Dropdown value by using Text
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select selection2 = new Select(dropDown2);
		selection2.selectByVisibleText("Appium");
		
		//Select Dropdown value by using Text
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select selection3 = new Select(dropDown3);
		selection3.selectByValue("3");
		
		//Get number of option in Dropdown
		WebElement dropDown4 = driver.findElement(By.className("dropdown"));
		Select selection4 = new Select(dropDown4);
		List<WebElement> noOfOptions = selection4.getOptions();
		int size = noOfOptions.size();
		System.out.println("Number of options in dropdown : " + size);
		
		//Option select using sendKeys
		WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropDown5.sendKeys("LoadRunner");
		
		//Multi Select
		WebElement dropDown6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelect = new Select(dropDown6);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);
		multiSelect.selectByIndex(4);
	}

}

package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		// Enter Text in TextBox
		WebElement enterTextBox = driver.findElement(By.id("email"));
		enterTextBox.sendKeys("Testing1");
		
		//Append Text in TextBox
		WebElement appendTextBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendTextBox.sendKeys("Testing2");
		
		//Get Default Value of TextBox
		WebElement getValueBox = driver.findElement(By.name("username"));
		String value = getValueBox.getAttribute("value");
		System.out.println("The Value of text box : " + value);
		
		//Clear text from TextBox
		WebElement clearTextBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearTextBox.clear();
		
		//Text box state display
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println("Is enabled : "+ enabled);
		
		//driver.quit();

	}

}

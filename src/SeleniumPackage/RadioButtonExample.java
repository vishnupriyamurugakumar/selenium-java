package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		// Get Default check status of radio button
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean status1 = option1.isSelected();
		boolean status2 = option2.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		// Select particular option in radio button
		WebElement above40 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		above40.click();
		
	}

}

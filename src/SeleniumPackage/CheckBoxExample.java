package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		//Check one option
		WebElement VB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));
		VB.click();
		
		//Get Checked status
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean seleniumStatus = selenium.isSelected();
		System.out.println(seleniumStatus);
		
		//Deselect the selected checkbox
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		 if(option1.isSelected()) {
			 option1.click();
		 }
		 
		 WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		 if(option2.isSelected()) {
			 option2.click();
		 }
		 
		 //Multi select in check boxes
		 WebElement check1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		 WebElement check2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		 WebElement check3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		 check1.click();
		 check2.click();
		 check3.click();
		 
	}

}

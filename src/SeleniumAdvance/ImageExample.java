package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");	
		
		//Get image element and click it
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		image1.click();
		
		driver.navigate().back();
		
		//Find broken image
		WebElement image2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		if(image2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Broken");
		}else {
			System.out.println("Not Broken");
		}
		

	}

}

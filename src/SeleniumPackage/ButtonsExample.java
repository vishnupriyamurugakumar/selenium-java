package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Get Position of Button
		WebElement positionButton = driver.findElement(By.id("position"));
		Point xypoint = positionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X Value : " + xValue + " & "+ "Y Value : " + yValue);
		
		// Get Color of Button
		WebElement colorButton = driver.findElement(By.id("color"));
	    String colorValue = colorButton.getCssValue("background-color");
	    System.out.println("The color of button : " + colorValue);
	    
	    //Get Size of Button
	    WebElement sizeButton = driver.findElement(By.id("size"));
	    int height = sizeButton.getSize().getHeight();
	    int width = sizeButton.getSize().getWidth();
	    System.out.println("Height : " + height + " & " + "Width : " + width);
	    
	    //Click Button
	    WebElement clickButton = driver.findElement(By.id("home"));
	    clickButton.click(); 

	}

}

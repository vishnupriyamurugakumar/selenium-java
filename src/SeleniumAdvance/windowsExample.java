package SeleniumAdvance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

	// 1. Open new window and click one button
		// Get Parent Window Handle
		String parentWindow = driver.getWindowHandle();
		
		//Open new Window and click button
		WebElement button1 = driver.findElement(By.id("home"));
		button1.click();
		
		// Get All windows handle
		Set<String> allWindows = driver.getWindowHandles();
		
		// Switch control to new window
		for (String eachwindow1 : allWindows) {
			
			driver.switchTo().window(eachwindow1);
			
		}
		
		// Get Button element and click in newwindow
		WebElement newWindowButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]"));
		newWindowButton.click();
		
		//Thread.sleep(3000);
		
		// close new window
		driver.close();
		
	    //Switch control to parent window
		driver.switchTo().window(parentWindow);
		
	// 2. Get number of Opened windows
		//Click button to open multiple windows
		WebElement multipleButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multipleButton.click();
		
		//Get number of opened windows
		int noOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Opened windows : " + noOfWindows);
		
		//hread.sleep(3000);
		
	//	3. Close all opened windows except parent
		//Click button to open new windows
		WebElement openWindowsButton = driver.findElement(By.id("color"));
		openWindowsButton.click();
		
		// Get all windows handles
		Set<String> allWindows1 = driver.getWindowHandles();
		
		//Close all windows except parent
		for (String eachWindow2 : allWindows1) {
			if(!eachWindow2.equals(parentWindow)) {
				driver.switchTo().window(eachWindow2);
				driver.close();
			}
		}
		//Thread.sleep(3000);
		driver.quit();
	
	}

}

package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

	// 1. Click button in frame
		
		// switch control to frame and get frame element and click
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		// Get text of button after click
		String buttonText = driver.findElement(By.id("Click")).getText();
		System.out.println(buttonText);
		
		// To switch control to default page
		driver.switchTo().defaultContent();
		
	// 2. Click button in nested frame
		
		//switch control to target frame and click button
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		
	// 3. Get number of frames in page
		
		driver.switchTo().defaultContent();
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = allFrames.size();
		System.out.println(noOfFrames);
		
	}

}

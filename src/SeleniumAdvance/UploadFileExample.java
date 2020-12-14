package SeleniumAdvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");	
		
		//Get and Click upload button
		WebElement chooseFileButton = driver.findElement(By.name("filename"));
		chooseFileButton.click();
		
		Thread.sleep(5000);
		
		//Copy file path in clipboard and paste in filename field in local
		String fileLocation1 = "C:\\Users\\vishnu\\Downloads\\testleaf.xlsx";
		StringSelection filePath1 = new StringSelection(fileLocation1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath1, null);
		
		Thread.sleep(3000);
		
		//Paste in filename and click enter to upload
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

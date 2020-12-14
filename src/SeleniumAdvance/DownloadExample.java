package SeleniumAdvance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		//Get and Click Download Link
		WebElement downloadExcelLink = driver.findElement(By.linkText("Download Excel"));
		downloadExcelLink.click();
		
		// Explicit wait to file get downloaded
		Thread.sleep(3000);
		
		//Check file gets downloaded in specified location
		File fileLocation = new File("C:\\Users\\vishnu\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("testleaf.xlsx")){
				System.out.println("File gets downloaded");
				break;
			}
		}
		
	}

}

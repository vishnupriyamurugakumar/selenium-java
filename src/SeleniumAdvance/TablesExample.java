package SeleniumAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch browser and then target page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");		
		
		// Find number of Columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int colCount = columns.size();
		System.out.println("Column count : " + colCount );
		
		//Find number of Rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Row Count :" + rowCount);
		
		//Get the progress value of 'Learn to interact with Elements
		WebElement progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String progressPercent = progress.getText();
		System.out.println("Progress percentage is " + progressPercent);
		
		//Check the vital task for the least completed progress
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<>();
		
		for (WebElement webElement : allProgress) {
			String progressString = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(progressString));
		}
		System.out.println(numberList);
		
		int least = Collections.min(numberList);
		String leastString = Integer.toString(least) + "%";
		
		// //td[normalize-space()='20%']//following::td[1]
		String finalPath = "//td[normalize-space()=" + "\'" + leastString + "\'" + "]" + "//following::input[1]";
		System.out.println(finalPath);
		
		WebElement checkBox = driver.findElement(By.xpath(finalPath));
		checkBox.click();
	}

}

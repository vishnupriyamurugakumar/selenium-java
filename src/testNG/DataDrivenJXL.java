package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenJXL {

	String data[][] =null;
	WebDriver driver;

	public String[][] excelLoginData() throws BiffException, IOException {

		FileInputStream excelFile = new FileInputStream("C:\\Users\\vishnu\\TestFile\\LoginTestData.xls");
		Workbook workbook = Workbook.getWorkbook(excelFile);
		Sheet sheet = workbook.getSheet(0);

		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String testData[][] = new String[rowCount-1][columnCount];

		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}

		}
		return testData;
	}

	@DataProvider(name = "LoginCredentials")
	public String[][] getLoginTestdata() throws BiffException, IOException {
		data = excelLoginData();
		return data;
	}

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "LoginCredentials")
	public void loginCases(String uName , String pword) {

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement uNameBox = driver.findElement(By.id("txtUsername"));
		uNameBox.sendKeys(uName);

		WebElement psWordBox = driver.findElement(By.id("txtPassword"));
		psWordBox.sendKeys(pword);

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjectsUsingFindBy;

public class LoginTestcaseUsingPageFactoryFindBy {

	@Test
	public void loginCase() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishnu\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPageObjectsUsingFindBy.class);
		
		LoginPageObjectsUsingFindBy.userName.sendKeys("Admin");
		LoginPageObjectsUsingFindBy.passWord.sendKeys("admin123");
		LoginPageObjectsUsingFindBy.loginButton.click();
		
	}
}

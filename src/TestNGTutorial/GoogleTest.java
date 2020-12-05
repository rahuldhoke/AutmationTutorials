package TestNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	//in a class if its test case then always mention test so that it shws its test cases
	WebDriver driver; // this driver variable is made global by delclaring inside the class. Then 
	
	//test cases are always independent from each other
	
	@BeforeMethod
	public void setup() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  driver = new ChromeDriver(); // becuase webdriver is already declared above hence we ignored it here
	}
	
	@Test
	public void Test1() {
		System.out.println("this is test case 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("this is test case 1");
	}
	
	@AfterMethod
	public void ExitChrome() {
		driver.quit();
	}
}

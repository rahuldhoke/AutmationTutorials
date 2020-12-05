package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Sel Firefox driver\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  
		  driver.get("https://google.com"); // opens a url in a new browser
		  String result = driver.getPageSource(); // page source is saved
		  String title = driver.getTitle(); // to get title of the webpage
	}

}

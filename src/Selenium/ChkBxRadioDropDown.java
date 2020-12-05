package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkBxRadioDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://register.freecrm.com/register/");
		 
		  //Checking the check box
		  driver.findElement(By.name("terms")).click();
		  
		  
		  
	}

}

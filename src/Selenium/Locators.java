package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  
		  //*********************************LOCATORS IN SELENIUM****************************
		  //Total 8 locators are  avaliable 
		  driver.get("https://www.facebook.com/"); // opens a url in a new browser
		  Thread.sleep(2000);  //Wait for 2 seconds
		  driver.findElement(By.name("email")).sendKeys("dhokerahuls@yahoo.co.in"); //Name Locator
		  driver.findElement(By.id("email")).sendKeys("dhokerahuls@yahoo.com");  //id locator
		  //driver.findElement(By.cssSelector("abc")).click();   // Css selector
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(2000);
		  
		  //CREATING OBJECT
		   //WebElement TxtBx = driver.findElement(By.id("email"));
		   //TxtBx.sendKeys("donkey");
		  
		  //Important - all the Links are represented  by a tag - for every link text will be there
		  driver.findElement(By.linkText("Forgotten password?")).click();  //LinkText
		  driver.findElement(By.partialLinkText("Forgotten")).click();  //partial link text
		  //driver.findElement(By.className("avc"). 
		  //driver.findElement(By.tagName(tagName)
		   
		  
		  
		  System.out.println("finished");
	}

}

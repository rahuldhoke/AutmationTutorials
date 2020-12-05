package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ImpCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.ie.driver", "D:\\Softwares\\Sel_IE driver\\IEDriverServer.exe");     
		  WebDriver driver = new InternetExplorerDriver();
		  System.out.println("done");
		  
		  driver.get("https://google.com"); // opens a url in a new browser
		  driver.manage().window().maximize(); // maximizing the browser
		  
		  
		  driver.manage().deleteAllCookies(); // deleting all cookies
		  driver.navigate().back(); // navigating backwards
		  driver.navigate().forward();
		  
		  //navigating from one domain to different domain
		  driver.navigate().to("arg0");
		  driver.navigate().refresh();
		  
		  String result = driver.getPageSource(); // page source is saved
		  String title = driver.getTitle(); // to get title of the webpage
		  
		  
		  
		  
		  
		  
		  /////////////////////WEBELEMENT************************************
		  String Text = driver.findElement(By.id("Text")).getText(); // Retreive inner text 
		  String innertext = driver.findElement(By.id("abc")).getText(); // Retreive inner text of element
		  
		  //GetAttribute ; each element has size, color,value, etc
		   //if u want to retreive value of specfix property then use below
		  driver.findElement(By.id("findID")).getAttribute("value"); // data present in value propery is retreived
		  driver.findElement(By.id("findID")).clear();
		
		
	}

}

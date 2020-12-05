package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//find total number of links on the page
		//find text of these links on the page
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://register.freecrm.com/register/");
		  driver.findElements(By.tagName("a")); // this statement is find out the tag name -imp is below statment
		  		//List <WebElement> linkList - this willsave all the a tag in list
		  List <WebElement> linklist = driver.findElements(By.tagName("a"));
		  	// List Import from java.util
		  //size will give the total number of elements
		  System.out.println("total links" + linklist.size());
		  	for(int i=0; i<linklist.size(); i++)  //i < means -- auto decreases value by 1
		  	{
		  		linklist.get(i).getText(); // this will give the text of links from 0 to 1	
		  	}
	}

	
	
}

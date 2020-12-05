package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prss control + F to bring the xpath edit box in chrome
			// check which html tag the element has 
		//syntax -- //html tag [@ Propery Name = 'value']
		//@Name
		//@Class
		//contains  -- ensure when u r using contains u wont use =,     use,
		//starts-with
		//ends-with
		//Links   ---  Alll Links are starting with a tab
		//TYPE, VALUE,CLASS, NAMES ARE CALLED ATTRIBUTES
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.co.in/");
		  System.out.println("done");
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("google text box"); //@proprtey name
		  driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();	//contains
		  driver.findElement(By.xpath("//input[starts-with(@value,'Google')]")).click();	//starts-with
		  driver.findElement(By.xpath("//input[ends-with(@value,'Google')] ")).click();	//ends-with
		  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();	//text - method 1
		  driver.findElement(By.xpath("//span[text()='Flights']")).click();	//text - method 2 - find span tag having text Flights
	
		  
		  //if you type input a - then google shows total number of input tags avaliable on the web page
		  //  //button -  all buttons tags will be highlighed, count will also be displayed
		  // ..span --- //span[text()='Flights'] --- find all span tags with text = Flights
		  //*******************************AND OPERATOR IN XPATH
		//input[@id='pwd' and @name='password']
		  
		  //********************************************PARENT TAG
		  //lets say table is there and inside table one radio button is there - 
		  //	this is syntax to find table	//div[@id='flightSearchContainer']
		  //first specify table tag and inside it specify radio button tag  --
		  						//div[@id='flightSearchContainer']//input[@id='ctl00_mainContent_rbtnl_Trip_0']
		  //with syntax. now inside this 
		//div[@id='flightSearchContainer']//input[@id='ctl00_mainContent_rbtnl_Trip_0']
		  //**********************************REVERSE XPATH*******************************************
		  //parent, preceding-sibling,forward-sibling
		  
		  
	
	}

}

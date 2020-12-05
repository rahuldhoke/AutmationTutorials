package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandlingForBrowser {
	
	//there is a difference between jscript popup and browser pop ups

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://www.popuptest.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		 
		  											// to get the handle of browser use this metho// this will rurn multiple handler data hence make a list
		  											//handler. iterator will give us the object to play with browser we cannot used for loop here
		  											//window id is in the form of string
		  Set<String> handler= driver.getWindowHandles(); // set import from set java util
		  Iterator <String> it = handler.iterator(); // passig the above handle in the iterator
		  
		  String ParentWidowID = it.next(); // this will give the handle of the first browser
		  System.out.println(ParentWidowID);
		  
		  String ChildWidowID =  it.next(); // navigating to next itertator will give id of child window. now the control is there on child window pop up
		  driver.switchTo().window(ChildWidowID); //we have switched to child window handle
		  System.out.println("title for child window is " + driver.getTitle());
		  
		  String PopupWindowTitle = driver.getTitle(); // getting the title of the java 
		  driver.close(); //this will close the current pop up browser. driver. quit will close all the browser
		  
		  driver.switchTo().window(ParentWidowID);  //now we are switching back to parent window
		  System.out.println("parent window title is " +  driver.getTitle());
			 	  
		
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://register.freecrm.com/register/");
		  Thread.sleep(2000);
		//********************************************************************************		  
		  // Isdisplayed method - output true or false
		  boolean blnobj = driver.findElement(By.name("email")).isDisplayed();
		  if (blnobj = true) {
			  System.out.println("emailid field is displayed");
		  }
		  else {
			System.out.println();
			  }
	
	//********************************************************************************}
	//Enabled or Disabled
		 boolean  blnobj1 = driver.findElement(By.name("action")).isEnabled();
		  System.out.println("object is  " +  blnobj1);
		  
		//********************************************************************************}
		  
		//********************************************************************************}
			//Selected 
		  //only applicated for check box, drop down or radio button
				 boolean  blnobj2 = driver.findElement(By.name("terms")).isSelected();
				  System.out.println("check box selection is  " +  blnobj2);
				  
				//********************************************************************************}	  
		  
	}
}

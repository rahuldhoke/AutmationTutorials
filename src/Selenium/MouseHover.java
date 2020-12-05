package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
  
public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://top5-websitebuilders.com/?gclid=CjwKCAiA4o79BRBvEiwAjteoYFpWCy3BMmClKn5EDGXiMukZ78R6J_zmfBPfokxcCb_Hy7Nf62nuKxoCnu4QAvD_BwE");;
		  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		//for mouse hover we have to created one Action class object
			//first actions below import from selenium
			//secod new actios we have to pass the driver reference
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("HOMEPAGE"))).build().perform(); //this will move the mouse to the object  
		  System.out.println("done111");
		
		

	}

}

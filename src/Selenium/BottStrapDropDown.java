package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BottStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			//there is no select tag for this drop down
			//no select means i cannot use select class
			//once we have select with multiple option then only we can use normal drop down
		
		//*********************important note
			//whether its bootstrap drop box with check boxes or no checkboxes all the interal values inside it will be referred with li tag
				//we have to find this tag, and using some name select it
				// if input field is there then it is for check box
		//
		//Get the collection of all LI in input box
 
		  System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Sel Firefox driver\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		   
		  driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp"); // opens a url in a new browser
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//button[@id='menu1']")).click();
		driver.findElements(By.xpath("//div[@class='dropdown-menu open'])//li"));
		
	}

}

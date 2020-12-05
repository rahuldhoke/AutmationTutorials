package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

//3 types of pop up
			//browser pop up containing url
			//alert pop up also know as java script pop up
			//File Upload Pop Ups
		
		
		//below will work only if type = file is there whwn u onspect the button
		//dont try to use .click after finding the xpath
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://html.com/input-type-file/");
		  Thread.sleep(3000);
		driver.findElement(By.name("fileupload")).sendKeys("E:\\Softwares\\NaveenAutomation\\Selenium\\Seleniu and Java\\CoreJava.xlsx");
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[4]/form/input[2]")).click();
		

	}

}

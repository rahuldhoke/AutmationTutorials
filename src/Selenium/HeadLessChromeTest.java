package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		
		  	ChromeOptions options = new ChromeOptions(); // creating obect for headess browser testing
		  	options.addArguments("window-size=1400,800"); //imp mandatory else your browse will ot get open in maximize mode
		  	options.addArguments("headless");
		  	
		  WebDriver driver = new ChromeDriver(options); // imp the above object options need to be provided over here
		  driver.manage().window().maximize();
		  System.out.println("done");
		  driver.get("https://www.facebook.com");
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bla bal");
		  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("bla bal");

		  //how to acheive above using page object model
//		  just befor launching the browser use above code
	
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		//Method 1
		WebElement btnradio = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]"));
		Thread.sleep(2000);
		btnradio.click();
		
		
	
	}

}

package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
	
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.spicejet.com/");
		  Thread.sleep(2000);
		  System.out.println("done");
		    
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // Getsceeenshotas method from selenium
		//FileUtils.copyFile(screenshotFile, new File("C:\\ScreenShot\\abc.png"));
		FileHandler.copy(screenshotFile, new File("C:\\ScreenShot\\abc.png")); // Instead of fileutil now Filehandler method is used
		
	}
}

package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Vrery imprtant
			//2 types of pop ups are there
				//java script popup which dosent has any url. just pop up is displyed with ok and caclee with some text
		
			//another pop up is opened with some url -- this is mostlly handled by browser methods
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  Thread.sleep(11000);
		 // driver.findElement(By.linkText("Sign in")).click();
		  		//driver.findElement(By.name("proceed")).click();
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		  
		  System.out.println("done");
		  //when pop up arrives 2 things need to be done
		  //Get the text of the pop up and click on OK button
		  //we have to switch from brwowser to pop up
		  		//how to switch
		  			//driver.switchTo().alert();
		  				//store above in Alert class wchic is avaliable in selenium
		  Alert alertpopup = driver.switchTo().alert(); // import alert from selenium
		  String txtpopup = alertpopup.getText(); // text present on that pop up will be saved
		  alertpopup.accept(); // Clicking on the OK button of the Pop up
		  			//alertpopup.dismiss(); // if cancel button is there then you can dismiss the popup
	}
	
}

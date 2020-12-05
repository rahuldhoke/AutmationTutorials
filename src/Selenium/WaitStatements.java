package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStatements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  
		  //Implicit Wait
		  Thread.sleep(3000); // forcefull wait also called static wait
		  
		  //Dynamic wait -
		  	//when object is found rest line is perfomred, it dosent wait for entire time out
		  //for below it is for page only. when page is loaded in 3 sec only then next step is perfomred
		  		//sel doseent wait for entire 40 secods
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //dynamc wait /this will wait for 30 secnds  till page gets loaded
		  
		  //Implicit wait
		  		//Implicit wait is applicable for all all all elements. somtime even if page is loadd still some elements are not loaded
		  			//so we tell sel even after page is loaded still wait for some time for all elements
		  				// specially drop down values takes times to come
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // dynamic wait
		  
		  
		  //********************************************ABOVE ARE IMPLICITLY WAIT****************************************
		  
		  // Explicit Wait - wait till the element is found on that page
		  		//even after page is loaded there can be a chance some elements are still pending on the page
		  
		  
	}

}

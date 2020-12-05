package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  
		  //*********************************LOCATORS IN SELENIUM****************************
		  //Total 8 locators are  avaliable 
		  driver.get("https://www.facebook.com/"); // opens a url in a new browser
		  Thread.sleep(2000);  //Wait for 2 seconds
		 
		  WebElement EdtBx_EmailID = driver.findElement(By.xpath("//input[@name='email']"));
		  sendkeys(driver, EdtBx_EmailID, 5, "donkey");
		
		  WebElement Btn_Submit = driver.findElement(By.xpath("//button[@name='login']"));
		  ClickOn(driver,Btn_Submit,5);
		
		  
	}				

	
	//Before using this method we have to create object of that element and then pass the values
	//Below methoe we are passing webdrirver , webelement , timeout for the webleent and also which value need to be passed thr senkeys
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value ) {
		//Webdriver wait is  new object present in sel for manging time
		//untill method is also present in sel
		//ExpectedConditions is also prsent in sel 
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element)); // ExpectedConditions error will go after writing the enntire code 
		element.sendKeys(value);
	}

	//method for clicking on webelement
	public static void ClickOn(WebDriver driver, WebElement element, int timeout ) {
		//Webdriver wait is  new object present in sel for manging time
		//untill method is also present in sel
		//ExpectedConditions is also prsent in sel 
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element)); // ExpectedConditions error will go after writing the enntire code 
		element.click();
	}  
	
	
}

//syncrniation
		//sync between seleniu speed and browser speed
		//selenium tries to interact with object immediately
		//when page is taking some time to load then what to do
		//sync methos were itnorduced -- implicit waits and explicit waits
		
		
		//Static watis
		// Thread.sleep(millis); this will compulsory wait for XX seconds
		
		//dynamic waits -- all below are dynamic waits
			//if object is found before specfied time then the rest of the time is is ignored. further execution is done
		
		//page load time out
			//page load timeout is for webpage loading
		  //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //
		
		//Implcit wait
			//Implicit wait is always applied globally. it is applicable for all the webelements
		  	//Exampple - if 3 statments are present on the page  below the implicity wait statements is applied  for each line object will wait for 20 seconds
		  	// -- implicit wait is directly interacting with driver. so if driver is playing with 50 objects then it is applicable for the 50 weblements		
		  //for each element selneium waits for 30secnds. if element is found withing 2 seconds then rest of the 28 seconds is ignored
		  //so for total 3 objects it will wait for 30+30+30 = 60 
		  	//it is applcable for all the webelements driving is handnling
		  	//if findelemente is used the it takes care of 1 element only
		  	//if find elements is used then it is for all mutiple elements'
			//implicitly wait should never be used for larger applcistion where lot of elements are avaliable 
			//implicitly wait can be changed any number of times	
		
		  //Explicit Wait
		  	//there is a keyword for implicity wait but there is no keyword for explicitly wait
		  	//explicity wait is provided by method WebDriverWait
		  // Untill is also a method 
			//using the navvens method foe each webelement we can use whatever waits we want
				//we should never mix implicit wait and explict wait
						//reason is first it will wait for implicit wait and then for explicit method wait which we have created
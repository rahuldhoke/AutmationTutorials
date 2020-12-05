package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// - for select drop down select tag opttion should be avaliale
		//data values are avaliable in the form of options 
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://www.spicejet.com/");
		  Thread.sleep(15000);
		  WebElement day = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  
		   Select select = new Select(day); //import Select from selenium //inside Select() we have to pass the webelement
		  select.selectByVisibleText("USD"); //which value u want to select from drop down -- syntax
	
	//how to check if drop down is single or multi select
		  boolean ab = select.isMultiple();
	
    // how to get total values and size of the list box
		  List <WebElement> listCurrency = select.getOptions(); // select object is alreday created above
		  //List import from java.util package
		  int ab1 = listCurrency.size(); //total number of options present inside the list box
		  System.out.println("total number of value present inlist box are " + ab1);
		  
		  
		  // how to print all the values present inside the drp down
		  		//whenever there is a list use for loop
		  for(int i=0; i<listCurrency.size();i++) {
			  String valuesinlistbox = listCurrency.get(i).getText();
			  System.out.println(valuesinlistbox);
		  }
		  
		  //Method - 2 -- using webelements
		  	// how to print all the values present inside the drp down
	  		//whenever there is a list use for loop
		   List<WebElement> currlst = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']//option"));
		  
		   for (int j = 0;j < currlst.size(); j++ ) {
			   String as = currlst.get(j).getText();
			   
		   }
	}

}

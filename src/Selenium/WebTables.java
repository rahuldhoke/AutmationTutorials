package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//webtables
	//tbody tag == is for identifyig webtable
	//tr tag -- is or table rows  // check total no of trs
	//td tag -- is for columns -- is for table data
			//first row will be displayed then columns 
	//th -- table heading
			//find out the total number of rows using tr

//if u obsever html data as per below then u will notice that row data is changing but column data is same

/*
 * //*[@id="customers"]/tbody/tr[2]/td[1]  // Column 1 data  for row 2
	//*[@id="customers"]/tbody/tr[3]/td[1] // Column 2 data for row 3 
 * 
 */

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");     
		  WebDriver driver = new ChromeDriver();
		  System.out.println("done");
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  
		  String beforexpathCompany = "//*[@id=\"customers\"]/tbody/tr[";
		  String afterxpathCompany = "]/td[1]";  //change the colum to 1
		  
		  //pulling data value from column 1
		  for (int i = 2; i<=5; i++) {
			  String actualxpath = beforexpathCompany + i + afterxpathCompany;
			  String x = driver.findElement(By.xpath(actualxpath)).getText();
			  System.out.println("Firt colum Data " + x);
		  }
		  
		//pulling data value from column 2
		  
		  String beforexpathContact = "//*[@id=\"customers\"]/tbody/tr[";
		  String afterxpathContact = "]/td[2]";  //change the colum to 2
		 
		  for (int j = 2; j<=5; j++) {
			  String actualxpath2 = beforexpathContact + j + afterxpathContact;
			  String y = driver.findElement(By.xpath(actualxpath2)).getText();
			  System.out.println("second column data " + y);
		  }
		  	//Note above was just example to learn and it was hard coded value
		  //How to get total number of rows
		  				//below line // tr is very important this will give tota number of rows
		 List <WebElement> rows =  driver.findElements(By.xpath("//table[@id='customers']//tr")); //import ist from java.util
		 int totalrow = rows.size();  //.size will give the total number of row count	
		 		System.out.println("total number of rows" + totalrow);
	}

}

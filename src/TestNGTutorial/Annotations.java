package TestNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	//in a class if its test case then always mention test so that it shws its test cases
		WebDriver driver; // this driver variable is made global by delclaring inside the class. Then 
		
		//test cases are always dependent from each other
		
	//Grouping Test Cases
		//Test casaes can belong to group such as EWR/Release/CWO etc
		//after execiton test cases will be displayed group wise
		
		@BeforeMethod
		public void setup() {
		System.out.println("setup file");
		}
		
				
			@Test(priority=1,groups="EWR")
			public void Test1() {
				System.out.println("this is test case 1");
			}
			
			@Test(priority=2,groups="CWO")
			public void Test2() {
				System.out.println("this is test case 2");
			}
			
			@Test(priority=3,groups="CWO")
			public void Test3() {
				System.out.println("this is test case 3");
			}
			
			@Test(priority=4,groups="EWR")
			public void Test4() {
				System.out.println("this is test case 3");
			}
			
		@AfterMethod
		public void ExitChrome() {
			System.out.println("exit chrome");;
		}
	}
	
	

package Selenium;

import org.openqa.selenium.WebDriver;

public class ConstructorWays {
	WebDriver driver;
	
		// TODO Auto-generated method stub

	
		//below constructor will accept webdrive as an argument
			//what ever webdrive which is received (chrme/ie/ff) is passed using the this keyword
	
		// driver is coming from pagefactory. this local driver is also specfied in same class using global variable.
			//to initialize this local driver in the same class this keyword is used
	
		//n never define a constructor in a main method
	
		//whith pagefactory this keyword , constructor will also get initialized
		
	//imp -- the method where webdriver is used - return that method with webdriver;
		public ConstructorWays(WebDriver ldriver) {
			this.driver = ldriver;
		}
	
		// how to load above driver in another class and methods
		
	}



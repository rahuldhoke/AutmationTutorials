package ConstructorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementsSavingTechnique {
	WebDriver driver;
		// TODO Auto-generated method stub

		//Method 1 - storing webelements in class using some commands
		By username = By.id("login"); // example for facebook login page userid field login is the id 
		By password = By.name("pass"); //example for facebook login page password field pass is the id
	

	//Creating constructor to load above objects and driver
		public WebElementsSavingTechnique() {
			this.driver = driver;
		}
}



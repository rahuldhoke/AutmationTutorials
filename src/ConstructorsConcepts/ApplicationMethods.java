package ConstructorsConcepts;

import org.openqa.selenium.WebDriver;

public class ApplicationMethods {
	static WebElementsSavingTechnique objLoadWebElements;
	
		//As per rule creating contructor and loding the class in that constructor
	public static void  ApplicationMethods() {
		objLoadWebElements = new WebElementsSavingTechnique();
	}
	
	public void LoginToFB(WebDriver driver) {
		
		
	}
}

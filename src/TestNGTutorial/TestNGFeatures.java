package TestNGTutorial;

import org.testng.annotations.Test;


//Dependency -- example -- every test cases are dependenet on login test.
		//if login test case fails then there is no meaning of exeution
			//if lfogin test pass rest all test cases which are dependent on login will be executed other skipped

public class TestNGFeatures {
	
	@Test()
	public void logintest() {
		System.out.println("login test");
		int i = 9/0;
	}

	@Test(dependsOnMethods="logintest")
	public void homepage() {
		System.out.println("home page test");
	}
	
}

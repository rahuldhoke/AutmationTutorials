package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	//Annotationas are inthe form of @
	//Before Suite - are called prerequsite annonations - what to do before test case execution starts
		//	each annonations should be assoicated with atleast 1 method else error will be thrown
			//@Test - this is test case
				//@After - these are post conidtion - after executing test case what to do 
	@BeforeSuite  // Executed first time always  
			public void setup() {
				System.out.println("Before Suite --Environment vari / system property / input data ");
			}
			
			@BeforeTest // Before Test ---Executed second time always
			public void launchBrowser() {
				System.out.println("Before Test - google browser is launched");
			}
			
					@BeforeClass
					public void Login() {
						System.out.println("Before Class --Login to app");
					}	
						//////////////////
						@BeforeMethod
						public void EnterURL() {
							System.out.println("Before Method --- Enter the URL");
						}
			
							@Test
							public void testcase1() {
								System.out.println("Test Case  --  this is test case 1");
							}

							@Test
							public void testcase2() {
								System.out.println("Test Case  --  this is test case 2");
							}
							
							//End exeuction
								@AfterMethod
								public void logout() {
									System.out.println("After Method --- log out from the application");
								}
		
									@AfterTest
									public void DeleteCookies() {
										System.out.println("AfterTest  -  Delete all cookies");
									}

										@AfterClass
										public void closebrowser() {
											System.out.println("After Class Close the browser");
										}
								
											@AfterSuite
											public void genetestrep() {
												System.out.println("After Suite -- Generate Test Report");
											}
		

}



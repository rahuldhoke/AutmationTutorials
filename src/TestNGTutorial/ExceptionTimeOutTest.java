package TestNGTutorial;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	//There can be a case wehere due to reason like loop not ending, some thing not found, incorrect wait
		//test case will keep on running for entire night
	@Test(invocationTimeOut=2)
	public void testtimetolong() {
		System.out.println("this test cases will automatically exit in 2 seconds");
		
		//Bad coding
			//always terminate ur loop
				//never write some infinite loop
	}

}

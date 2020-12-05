package TestNGTutorial;

import org.testng.annotations.Test;

public class RerunTestCases {

	
	//if you want to execute test case 10 times then we have one annotation
	// there is no for loop we can create for any annotation
	// invocationcount = 10
	
	//when u want to exeucte same test case with multiple set of data then use this
	@Test(invocationCount = 10)
	public void runtestmultimes() {
		System.out.println("this test case will be executed multiple times");
	}
}

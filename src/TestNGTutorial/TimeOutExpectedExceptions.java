package TestNGTutorial;

import org.testng.annotations.Test;

public class TimeOutExpectedExceptions {

	//Continue test case when u know the exception -  i am expecting exception dont exit
	//sometimes u want to continue ur exeuction when u know ur exception in that case no need to stop
	
	@Test(invocationTimeOut = 2,expectedExceptions=NumberFormatException.class)
	public void continueexecutioninexception() {
		System.out.println("even after execution test case will be continued ");
	}

	//Handling exception in command and not at top level public class aa throws exceptio
		//check below example
		
	@Test(expectedExceptions = NumberFormatException.class)
	public void test2() {
		String x = "100A";
		Integer.parseInt(x);
		
	}
		

}

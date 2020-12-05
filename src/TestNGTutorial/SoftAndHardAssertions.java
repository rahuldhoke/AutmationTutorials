package TestNGTutorial;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertions {

	//                                 HARD ASSERTION
	//if any line or step fails then all the remaning lines are not executed. this is hard assrtion
		// hard assertion -- when browser itselft is not getting opened then there is no point in executgn remaning steps
			//hard assertion -- same if login fails
	
	//                                 SOFT ASSERTION
		//soft assertion will continue execution of next line even if it fails
		// problem with soft assertion is that even the step failed but still test status is passed. how to solve it
			//one more method softassert.assertAll
					//this will check status of all softassert whether passed or failed. if any 1 softassert is failed then it mark the test case fail
						//note u have to write the softaseert after all test steps have been written
						//messages can also be provided to soft assert
	@Test
	public void Test1() {
		System.out.println("open browser");
		//hard assert below 
		Assert.assertEquals(true, false,"values are not matching"); // hard assertthis assert failed hence rest of the steps are not executed
		System.out.println("enter login credentials"); 
		//soft assert
		Assert.assertEquals(true, false); // import correct testng soft assert else it will fail. import org.testng.asserts.SoftAssert;
		System.out.println("looged into the applications");
		//SoftAssert.As
		}
}


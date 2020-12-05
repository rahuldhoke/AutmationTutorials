package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void Test1() {
		String a = "abc";
		Assert.assertEquals(a, "abcw","test case is passed");
	}

	@Test
	public void Test2() {
		boolean b = true;
		Assert.assertTrue(b); //'Method 1 of wrting assert'
		Assert.assertEquals(b, true); // Method 
	}
}

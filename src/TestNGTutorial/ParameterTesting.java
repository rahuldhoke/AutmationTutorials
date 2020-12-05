package TestNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {
	
// Below parameters varaibels are Environment variables or configuration variables
			//note only env or config variables add here 
	// Very Imp 
	//for parameters ; parameters keyword should be defined
		// {} braces should be mentioned inside brackets
		// parameter created in xml file should be specfied in paramters annotation
		//mandatory - u should define above 2 ids in method which is test case also
			//if u dont do above no error but how will u pass the paramrater value  in method, for that u have to create parameter in method
			//based on ur method or test case requrement u have to decide parameters
	@Test
	@Parameters({"userid","password"}) // 2 parameters are defined in xml file -- note { and } 
	public void test1(String userid, String password) {
		String a = userid;
		String b = password;
		System.out.println(a + b);
	}

	public void test2(String userid, String submit) {
		String a = userid;
		String b = submit;
		System.out.println(a + b);
	}

}

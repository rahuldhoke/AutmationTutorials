package Selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjRepoTestData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  // to read the property file we have to create object of that property file
		  //in java we have one default class and that name is properties
		  String location = "D:\\Softwares\\Eclipse\\Ecl_wrksp\\AutomationTesting\\src\\SeleniumTutorial\\config.properties";
		  
		  Properties prop = new Properties(); // import this from java . util packages)
		  FileInputStream ip = new FileInputStream(location); // now we need to create the obect of fileinputstream class
		  prop.load(ip); //addd throws declaration   //in aboeve fileinput stream we have to specify the file location
		              // Fileinput stream --- add add throws declaration filenot found exception
		  
		 
		   // how to reac properties from propety file
		 String abc = prop.getProperty("name");
		 System.out.println(abc);
		 
		 //******************************IMPORTANT****************************
		 //We can save the object properties in this file and then re use it
		 //page wise define ur OR
		
	}

}

package CoreJava;

public class ExceptionHandling {
	int a = 10;
	public static void main(String[] args) {
	// Exception is JVM has encountered some error and it will terminate that program
		
		
		
		//so if u add exception in your program then ur program will not get terminated*****************
		//selenium point of view u can take the exception, take the screen shot, save the log bla bla 
		
				
		//types of exceptions are 
		//null pointer exception, 
		
		//array index, 
		//string array out of bound, 
		//file not found exception
			//we have to handle exception properlty using try catch bock
		
		//  Uncaught Exception - exception which java is unable to catch 
					//int i = 10;
					//int k = i/0;
			//below exception is thrown
					//Exception in thread "main" java.lang.ArithmeticException: / by zero
					//at CoreJava.ExceptionHandling.main(ExceptionHandling.java:15)
			
			// Caught Exception : exception which java is able to catch 
				//Thread.sleep(2000); // Thread is class and sleep is a method in java
			//null pointer exceptio
				//sometime u have not declared ur object properly or u have declared a null object 
				// check below example
			/*ExceptionHandling obj = new ExceptionHandling();
			obj = null;
			System.out.println(obj.a);
			*/
				//if u run above code below error will be displayed'
							//Exception in thread "main" java.lang.NullPointerException: Cannot read field "a" because "obj" is null
							//at CoreJava.ExceptionHandling.main(ExceptionHandling.java:28)
			//In Java when u create an object u have assoicate it with some var,method anything
					//if u dont then error will be thrown
			
	//so to handle eceptions -- exception handling concept is used
		
		
//**************************/Exception Handling - try and catch*****************************************************************
					// example -- there are few lines which are going to throw error just add thse like in try block
						//so even if exception is thrown it will be cought in this block
		//in catch block we have to provide an exception what type of errr its giving -- important this exeption is already present in java (Exception e)
		//hover the mouse on the Exception and it will give u the exception details
		// in try add the code whcich is going to throw exception
		
			try {
				int h = 9/0;
				System.out.println("program got executed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			// if u run above program exception will be displayed in console but not in the application
				//this exceptio is displayed for info and is displayed becuase of e.printstacktrace
	
			//Handling all types of exception//
	//there are n number of exception and each and every exception u cannot remember
			//Imp  - just write exception in catch andn this Exception will handle all types of errors 
	}		

}

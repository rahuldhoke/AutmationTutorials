package CoreJava;

public class Methods {
	
		public static void main(String[] args) {

			Methods obj = new Methods();
		int temp = 	obj.ReturnMethod(); // non static methods can be access only by using object 
			System.out.println(temp);
		
		String temp1 = Static_ReturnMethod(); // Becuase this is static method it can be accessed without object
			System.out.println(temp1);
	
	// Very Imp -- why main method is void
			// we never write return statement in main method. hence it is aways void 
			
	//	System.out.println("This is ReturnMethod " + b);
			
	}

	// 3 types of methods
		// no input no output
		// no input some output
		//passing some input and getting some output
	 
	//public means avaliable to all 
	//return  - return shoud always be specfied with output variable
	
	// void -- meaning of void is it should not return a value
		//so for return methods void word should not be present
	
	// void - this directly indicates method dosent return any value
	
	//Method data type
			//if inside method some operators is returning value of string then data type for that method is string
	
	//Main Method -- main method is starting point of execution
			//java compiler will check if main methid is ther or not . if there it will execute all the thigs prsent inside the method
	//whenever u want to acces methods and var we need to create object. a

	//when object is created copy of all non static method is given to the obect
		//main method is not given to object - why becuase main method is static
		public void NoParamameterMethod() {
		System.out.println("Method with no parameter");
	}
	
	public void Parameter(int a) {
		System.out.println("Parameter Method - Not Returning any value -- INput is " +  a );
	}

	public int ReturnMethod() { // providing data type for int is also required
		int a = 12;
		return a; 
	}
	
	public static String Static_ReturnMethod() { 
		String k = "Marry again";
		return k; 
	}
}

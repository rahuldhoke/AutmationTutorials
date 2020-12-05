package CoreJava;

public class StaticAndNonStatic {
	//GLOBAL VARIABLES - VARIABLES DECLARED INSIDE CLASS ARE CALLED AS GLOBAL VARIABLES
		//scope of global variables is avaliable across all the functions with some conditions
					//	static method and variabes call them directly
					//static methods and varialbes can be called bu using objec and directly
	// non static - using object access
		//what is static and non static variable
				//variable which has static word is static and 
	String name = "rahul"; //non static global variables
	static int age = 40; // static global variable
	
	public static void main(String[] args) {
		//how to call static methods and variables
		//direct calling
			staticmethod(); // directly call static method
				System.out.println(age); // directly calling static variable
				
		// calling by class name
				StaticAndNonStatic.staticmethod();
				System.out.println(StaticAndNonStatic.age);
	
	//*****************HOW TO CALL NON STATIC METHODS AND VARIABLES
		//BY CREATING OBJECT WE CAN ACCESS
		StaticAndNonStatic obj = new StaticAndNonStatic();
			System.out.println(obj.name); // accessing non static var by object
			obj.nonstaticmethod(); // accessing not static method by obj
			// nonstaticmethod();
					//above is throwing error becuase non static method cannot be accesed dirctly. it needs object
	}
	//static and non static methods
			//static methods has static word and non static dosent have this work
	
	//Static methods and variables are not part of the objects
		// but non static methods are part of the object -- this is the reason non static objects can be access by created object
	//Rule or policy - static methods should be acccessed in a static way
	
		public static void staticmethod() {
			System.out.println("this is a static method");
		}
		
		public void nonstaticmethod() {
			System.out.println("this is a non static method");
		}
		
				
		
	

}

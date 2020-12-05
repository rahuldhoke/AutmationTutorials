package CoreJava;

public class ConstructorConcept {

	
		//constructor means -- 
		//used to define some class feature while creating object - common things which will be used by all classes
		//while creating object you may need some global variables which can be accessed by all the classes
		//constructor looks like function but its not
		//constructor cannot return any value
		//its name should be a class name
		// constructor can be overloaded
	
	//The momment u create the object its called
	//There is alwasy one default constructor
			// once u execute the class or program default constructor is called
	//Note: No need to create an object, constructor will be called automatically
	//for executing constructor it should be present in the main method
	
	// Very Important
	//there is one hidden constructor which gets exeucted automatically - u can take advantage of this
		//u can creator constructor for thinkks like login , data providing etc
	//if u write below line in main method then no error will be thrown becuase there is a default constructior
			//ConstructorConcept obj = new ConstructorConcept();
	// for below if u delete the construction then erorro will be throwin in main method if u add then directly 
			ConstructorConcept obj1 = new ConstructorConcept(10);
			ConstructorConcept ob2 = new ConstructorConcept(10,11);
	
		
		public ConstructorConcept() {
			System.out.println("default constructor");
		}
		
		public ConstructorConcept(int i) {
			System.out.println("single parameter constructor");
		}
		
		public ConstructorConcept(int i, int j) {
			System.out.println("double parameter constructor");
		}

		public static void main(String[] args) {
			ConstructorConcept obj = new ConstructorConcept();
			ConstructorConcept obj1 = new ConstructorConcept(10);
			ConstructorConcept ob2 = new ConstructorConcept(10,11);
			
		} 
}



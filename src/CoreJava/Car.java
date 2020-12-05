package CoreJava;

public class Car {
String model;
int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a = new Car();
					// new Car() - is an object of class class Car or called as object. Due to this 2 line one object will be created in the java class
					// what is a
							// a is referening this object, a is not an object
							// a is called as object reference variable
							//my body is an object and rahul is referencing this obect
							//duplicate object creation is not allowed
							//objec tis always created inside class hence when we create object class name is always defined					
	
			//shifting of objects from 1 obj to another obj is also allowed
		Car b = new Car();
		Car c = new Car();
		
		
		// hwo are variables referred to an object
			// each variable we create is referred to an each object(a,b,c) - example model and year example
		a.model = "Linea";
		a.year = 	2020;	
		
		b.model = "Linea-b";
		b.year = 	2021;	
		

		c.model = "Linea";
		c.year = 	2022;	
		


	
	}

}

package OOPs;

public class TestCar {
	
	
	public static void main(String[] args) {
	
		BMW b = new BMW();
		
		//Method Overriding 
		//Same/duplicate method exists in child and parent class with same name and same number of arguments
		//whenever a method is duplicate in child class or parent class then preference is given to child class methods
		b.start();
			//aobve example is called method overriding
	
		//methods overloading
			//method name is same with differnt arguments withing same class
	
	//once u extend the class then only methods from both the classses will be avaliable to third class as test class
		//All below are called static or compile time polymophism
		//1 to may calls - 
		b.stops(); // method inherited from car class
		b.saftey();
		b.refill();
		b.start();
		///////////////////////////////////////////////////////////////////////
		//parent cannot inherit some properties from child class methods
		//notice below the object is created - no
		CarClass c = new CarClass(); // object created for car class
		c.start();
		c.stops();
		c.refill(); // all methods from car class called sussessfully
		
		
		//now even though BMW is extending car class still some properties cannot be used from BMW class
		//c.safety()// cannot access safety method from bmw class
		//parent class cannot access object from child class - check above 
		
		//Dyaic polymorphisim - Run time polymorpim	
			//child class object can be reffered by parent class reference variable
		//common methods and parent class methods can be called by dynamic plymorphism'
				//above mena overriddent method a
		//Belw is also called top casting
		CarClass c1 = new BMW();
			// note - C is car class reference variable and BMW
			//CarClass is parent class of BMW class but still we re creating object ref variable for BMW  	
				//Start method is present in both carclass and bmw. below when u run pref is given to child class method
			c1.start();
			c1.stops();
			c1.refill();
			// -- Below method from BMW cannot be acceesses
			//c1.thefty(); start method is present in parent and child class hence we can access it
							// but if method is present in child but not in parent then child class methods r not avalible if we create above object
	}		// new bmw object is child class object
			//above object is referreed by parent class reference vairaible
			//BMW class says - loto of hardword is done for thefty so how can u can access this metds 
	
		//Top casting and down casting
	CarClass c1 = new BMW(); //bmw ca fit in car becuase bmw is child of car class
	
	
	////Down casting
	BMW c2  = (BMW)new CarClass(); // this is not allowed becuase beta baap ka baap nahi ban sakta. Carclass cannot fit into bmw. How to solve above
				//just cast it add bmw in car class
}				//running above prog will give one exception


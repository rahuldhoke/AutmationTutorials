package OOPs;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//already in build methods are present in one bank Interface
			//other banks can use these interface in form of methods
			//In interface we can acheive multiple inheritance - chid class can implement mutiple inheritiance
			//but in inheriticance child class can implement only 1 class inheritance
		//icici bank can implement brazi/us as weell as uk bank features
	
	
	
	//												3 intrface
		//Interace 			us bank								brazil bank									uk bank
		
		
		//Class									//hsbc bank is a class
	
		//	now hsbc banks wants to implement class in uk and brazi and us bank. so how will it work
			//so hsbc can inherit or use us bank , brazil ank and uk bank interace.
					//meaning of above is multiple inheritance
						//above relatisnip is called implemetations
	
		//there is no main method in interface
		//another bank icici also wants to open brank in us/brzil/uk
		//Interface no method body is defined -- only method name is given
		//only method we cannot give method body - only method declaration
		//In iterface we can delcare the variables but their value is constant for lifetime - value cannot be changed
		//no static methods in interface are allowed
		//no main method in interface
		//intefaces are abstract in nature, means we cannot create object of interface . means we cannot instatiate the object 
		//we cannot create static methods 
		 
		//variables are by default static in nature
		//create interface -rmb create >> interface
	
		//we need to use implement keword to implement the interface
				//java will throw untill and unless u define methods from usbank in this cass
		
		//why interface methos should be present in the hsbc class
				//this is a rule - us banks says we ar not bother what extra method u write in ur program
				// but our customer should get 3 facility debit, crdit and transfer mone
				//so u can write that code inside this method
		
		
		//we cannot create object of interface // belwo will throw error if u create object
			//USBank obk = new USBank();
	
		//*************************************************
		//Creating object of hsbc bank and trying to access classes
		//Below is also called Dyanmic or Compile time polymorphsim
				//We are accessing common overriden methods and uncommon methods from both the classes
					//overriddent methods + separate methds f hsbc bank will also be called
		//*************************************************
		HSBCBank hs = new HSBCBank();
		hs.credit(); // method from hsbc as well from interace usbankhs.
		hs.debit();// method from hsbc as well from interace usbankhs.
		hs.TransferMoney(); // method from hsbc as well from interace usbankhs.
		
		hs.educationloan(); // method from hsbc bank class only
		hs.carloan(); // method from hsbc bank class only
	
		//dynamic polymorphsime - main idea is to restric some methods from accessing in child classes
			//only and only owverriddent methods will be accessed
			//child class object can be reffered by parent interfaceinterfaceinterfaceinterfaceinterface referencce variable
					//parent - usbank interface and child hsbcbank 
				USBank hb = new HSBCBank(); // with this we can limit access for child class methods
					hb.debit(); // method from parent interace
					hb.debit();// method from parent interace
					hb.TransferMoney();// method from parent interace
					
					//hb.education loan and car loan not seen in the list 
					
				
	
	
	
	
	}

}

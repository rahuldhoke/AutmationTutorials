package PageObjModel;

public class POM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//                                 what is page object model
		//first layer will always be a page layer
		//websiste - login page/home page/tran page/bl bla functionality page  - all these are child classes
			//for each and every page we have to create separate java class. Related methods only will be added in this class
					//if 100 pages then 100 java classes
	/////////////////////////////////////////////////////////////////
		
		//second thing is create test layer for each class. use the concpet of inheritance - parent and child relationshoip to access methods
		
		// importatnt is we have to create testbase.java class . this is the parent class
				//all classes presen below will be extending this base class so that methods from testbase class is avaliable to all classes
			
		//all pages are interconnected to each other
//PAGE LAYER//////////
// Below are also called as page libraries
		
//login page
		//login page object will be added in login page
			//all methods for login page will be created in login page only 
		
// home page
		//home page objectd added here
			// method for home page 
		
//payment page		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

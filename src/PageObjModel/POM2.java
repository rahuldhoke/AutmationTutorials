package PageObjModel;

public class POM2 {

	public static void main(String[] args) {

//for each and every page we have to create  separate java class
//each page will have its own page fctory
//each method has to return something		

		
			//important
		//page object model is completely based on landing page strategt
				//means if you are clicking on any link then that link will take u to the next page
					//hence for all such types of methods u have to return an object of class
					//class object -- method will take u to that class when retured an object 

		//imp -- creating constructor in every test class is mandator. this way u can access prop and driver file 
		
		//control + shift + O  -- this will take care of importing all the things
		
		//note : when u want to call methds from other class first use obj name with. check below Login_Page
			//and this object should be created in @Before class -- initialization metehod
			//Login_Page.Login(prop.getProperty("FBEmailID"),prop.getProperty("FBPassword"));
		
		// everthing is coming from com.crm.pages classess. nothing is coming from testcase class
			//test case is just used for execution
	
		//Switch to frame is a common utility method
		
		//Clicking on a link
			//after u click on a link then 100% u will be navigated on one page 
			//hence the navigated page is returned page of this object. so when u create a method to click on this link this has to be a return method
			// check example below
		/*		
					public MainPage Click on Login(){
								//	;Login.Click
									// Return MainPage
							
		*/ 
		
		// In page object model and data driven     Each test case class will be independent from each other
		// In page object model and data driven     In hybrid framework all test case class is indepenedent from each other
					
	}

}

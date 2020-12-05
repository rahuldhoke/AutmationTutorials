package CoreJava;

//Meanig of this keyword
	//When we create fundtiosn with parameters and call that function then whatever value we pass in the parameter that will be provided in the fucntion
// but there are 2 global variables. and this variable should have that value
	//generally golbal varaibles we create just have one value which never change for lifetiem. but what if we want to change the value
//check the example below -- 2 variables name and int are created
		//In main method we are passing the value name as rahul and age as 41 but but but 
				//what if we want to give rahul to name and 41 to age then using this keyword we can do it
				//this keyword is used to initialize the class variable
		//So check line 21 and 23 - i have change the value of the name and age global variable
//So in short - this keyword changes the value of global varaibles whose value is alreday defined

public class ConstructorWithThisKeyword {
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		
		name = "changed";
		age = 30;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("rahul", 41);
		
	}

}

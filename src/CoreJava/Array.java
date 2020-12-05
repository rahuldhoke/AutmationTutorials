package CoreJava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		  // TODO Auto-generated method stub

		  // one array can accept one 1 dattype
		 // note : array name should be declared only once on left side with brackets
		 // data type is displayed twice left and write side
		 //new keyword is used only once 
		 // Lower Bound Index -- 0
		 // Upper Bound Index -- last emelent size -1
		 //Disadvantage
		  // Static array means where size is fixed -- to overcome - collections and # tables are used - dynamic array
		  //Stores only similar data types
		  
		  int arr[] = new int[4];  
		  arr[0]=10; //.25;  // in integer array you cannot store double value
		  arr[1]=11;
		  arr[2]=12;
		  arr[3]=13;
		   System.out.println("size of an array is" + arr.length);  //size of an array
		   //printing data inside an array
		  //.Length will give the size of an array
		   //************************************************
		  //method 1
		   System.out.println(arr.length);
		  //Method 2 - using for loop
		   for(int i=0;(i<=arr.length);i++) {
		    System.out.println("value of array is " + i);
		   } 
		    //************************************************
		   //print all the values inside an array
		    for(int j=0; j < arr.length - 1;j++) {
		     System.out.println(arr[j]); // Note [] should be used for array and not ()
		   }
		 
		 //*********************************************DUBLE ARRAY*****************************************************
		    double arr1[] = new double[5];
		     arr1[0] = 100;
		     arr1[1] = 100;
		     arr1[2] = 100;
		     arr1[3] = 100;
		 //*********************************************DUBLE ARRAY*****************************************************
		    //Character Array
		    char arr2[] = new char[3];
		    arr2[0] = 'a';
		    arr2[1] = 'w';
		    arr2[2] = 'e';
		 //*********************************************DUBLE ARRAY*****************************************************
		    //Character Array
		    String arr3[] = new String[3];
		    arr3[0] = "adfd";
		    arr3[1] = "wdfd";
		    arr3[2] = "dfdf";
		 
		 //*********************************************OBJECT ARRAY*****************************************************
		    //Object Array can store any data types
		    Object arr4[] = new Object[3];
		    arr4[0] = "11";
		    arr4[1] = "abc";
		    arr4[2] = true;
		    arr4[3] = 12.30;
		 }
		  
		}



package CoreJava;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a = 1;
		  
		 //do -- do this(test this functionality), increment the operator and then specify the condition
		  do {
		    System.out.println("value of a is " + a);
		    a++;
		     }
		  while (a <= 10);
		 
		  //Important
		    // if u give ++ before variablee then , by 1 value is increased first and then added to variable
		     //this ++ will be added to th left hand side variable and not next declared variable
		    // if u give ++ after variable then , to variable the increased value is added
		   int k = 10;
		     int c = ++k; // Very imp - value of k is increase by 1 - 
		     System.out.println("value of c is " + c);
		     System.out.println(c * k); // 20 * 10
		
	}

}

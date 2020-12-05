package CoreJava;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String a = "My ";
		   String b = "Name ";
		   String c = "Rahul ";
		   int f = 11;
		   int i = 12;
		   int g = 13;
		     
		   String e = a + b + c + f;
		   String h = a + f;
		   
		   System.out.println(e); // addition of only number is done
		   System.out.println(h); //string and number are mixed
		   
		   
		   String h1 = a + (f + 11);
		   System.out.println(h1); // aBecuase of bracked addition is done and then string is added
		   
		   // above example with no bracket
		   String hi = a + f + 11;
		  System.out.println(hi); // output is My 1111
		  
		  String er = f + i + a + b;
		  System.out.println(er);
		  
		  //Imp - Always use brackets if number are mixed with strings, this way number addition is done accrately
		  // In conatenation opereation if 2 numbers are encountred first then their addition is done and then string is added
	}

}

package CoreJava;

public class DataConversion {

	public static void main(String[] args) {

		//Data conversionn in java is called as wrapper classes
		
		//convert the value to int
		String a = "100";int o = 10;
		System.out.println(a + o); // output will 10010 

		//***********************Int conversion	
		int i = Integer.parseInt(a);
		int k = 10 + i;
		System.out.println(k);// output should be 110
	
		//***********************Doube conversion
		String n = "12.30";
		double d = Double.parseDouble(n);
		System.out.println(d + 100);  // outpt should 112.3
	
		//***********************char conversion
			//String ak = 'A'
				//no method avaliable
		
		//***********************boolean conversion
			String ak = "true";
			boolean lk = Boolean.parseBoolean(ak);
			System.out.println(lk);
	
			//int to string conversion
			int j = 200;
			String jk = String.valueOf(j);
			System.out.println(jk + 10); // output should be 20010 and not 210 
	
			// Impure or Improper conversion
			String dd = "100a";
			int ss = Integer.parseInt(dd);
			System.out.println(ss);		// Number format exception
	}

} 

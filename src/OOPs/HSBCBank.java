package OOPs;

public class HSBCBank implements USBank,AmericaBank { // imleting 2 iteraces using ,

	//multiple inerietance is also called is a relatioshop
//Below methods from americabank
public void America1() {
	System.err.println("method from america bank");
}
	
//***************************	
	//Below methodds for usbank	
	public void credit() {
		System.out.println("hsbc credit");
	}
	
	public void debit() {
		System.out.println("hsbc credit");
	}
	
	public void TransferMoney() {
		System.out.println("hsbc transfer momeny");
	
			//If i dont implement above method then error will be displayed
//***************************
	}
	///////////hsbac bank can have its own method also
		
		public void educationloan() {
			System.out.println("hsbc eductionloadn");
		}
		
		public void carloan() {
			System.out.println();
		}
	
	
		
		
	
	}
	
	

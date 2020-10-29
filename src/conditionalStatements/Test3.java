package conditionalStatements;

public class Test3 {

	public static void main(String[] args) {
		int atmpin=2234;
		int balamt=150;
		
		if(atmpin==1234)
		{
			System.out.println("Thank you for crrt pin");
		  
			if(balamt>=100)
			{
				System.out.println("withdraw");
			}
			
			else
			{
				System.out.println("amount cannot be withdrawed");
			}
		}
		
		else
		{
			System.out.println("invalid pin");
		}
		
		
	}	}



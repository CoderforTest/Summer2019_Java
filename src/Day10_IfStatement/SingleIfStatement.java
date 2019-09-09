package Day10_IfStatement;

public class SingleIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 single if:
		 	if (boolean expression) {
		 		//A
		 		
		 		 }
		 */
		
		if(9>8) {
			//true
			System.out.println("9 is gretar than 8");
			
		}
		
		if(9<8) {
			//false
			System.out.println("8 is greater than 9");
			
		}
		
		System.out.println("Test completed.");
		
		int num1=110;
		int num2=100;
		int max = 0;
		
		if(num1>num2) {
			max = num1;
		}
		
		if (num2>num1) {
			max=num2;
		}
		
		System.out.println("Maximum number between " + num1 + " and " + num2 + " is " + max + ".");
		
		if(num1==num2) {
			max=num2;
		}
		
		System.out.println("Maximum number between " + num1 + " and " + num2 + " is " + max + ".");
		
		
		//task02:
		
		
		
		
		
	}

}
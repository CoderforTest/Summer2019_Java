package Day10_IfStatement;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		if (condition is true) {
			//A
		}
		
		else (
		//must be declared with if condition. it is only executed if if condition results false.)
		{
	} 
		 */
		
		if(9>=8) {
			System.out.println("9 is greater than or equal to 8.");
		}
		
		else {
			System.out.println("not correct");
		}
		
		if(false==!false) {
			System.out.println("If block");
			
		}

		else {
			System.out.println("else block");
		}
	
		/*
		 Task01: 
		 if score <60 ==> failed
		 if score >=60 but less than 90 ==> pass
		 if score >=90 passed with distinction.
		   
		 */

		int score = 120;
		
		if (score>=60) {
			System.out.println("Passed");
		}
		
		else  {
			
				System.out.println("Failed");
		}
		
		/*
		 Triangle: has tree angles. sum of three angles must be equal to 180.
		 */
		
		int angle1 = 178, angle2 = 1, angle3 = 1;
				
		int sum = angle1+angle2+angle3;
		
		if ((angle1>0 && angle1<180) && (angle2>0 && angle2<180) && (angle3>0 && angle3<180) && (sum==180)){
			System.out.println("This is a triangle.");
			}
	
		else {
		System.out.println("This is not a triangle.");
		}

}
	}


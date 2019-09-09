package Day10_IfStatement;

public class MultiBranchIfStatement {

	/*
	 if - else if - else:
	 
	 if (condition1){
	 //A : executed if condition1 is TRUE
	  }
	  
	 else if (condition2) {
	  // B: else if (B) is only executed if condition1 is false AND condition2 is true.
	  }
	  
	 else {
	  // if condition1 AND condition2 are BOTH FALSE.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (false) {
			System.out.println("first statement is true. if block is executed.");
		}
		
		else if (true) {
			System.out.println("first statement is false AND second statement is true. else if block is executed.");
		}
		
		else {
			System.out.println("first statement is false AND second statement is false. else block is executed.");
		}
	
	/*
	 task01:
	 90<= grade A
	 80<= grade B
	 70<= grade C
	 60<= grade D
	 else => F
	 */
	
		int grade =85;
		
		if (grade>=90) {
			System.out.println("A");
		}
		
		else if (grade<90 && grade>=80) {
			System.out.println("B");
		}
		
		else if (grade<80 && grade>=70) {
			System.out.println("C");
		}
		
		else if (grade<70 && grade>=60) {
			System.out.println("D");
		}
		else {
			
			System.out.println("F");
		}
	
	
		System.out.println("============================");
		 
		 /*
		  write a program that
		 0-12 good morning
		 12-15 good afternoon
		 15-23 good night
		 24 good noon
		  
		  */
		
		 
		int hour = 12;
		
		if (0<=hour && hour<12) {
			System.out.println("Good morning!");
		}
		
		else if (12<hour && hour<=15) {
			System.out.println("Good afternoon!");
		}
		
		else if (15<hour && hour<=23){
			System.out.println("Good night!");
			}
		else {
			System.out.println("Good noon");
		}
	}
}
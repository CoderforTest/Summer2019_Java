package Day09_Review;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 single if statement:
		 
		 	if(boolean expression){
		 if (boolean expression, condition) is true, the block gets executed within {}
		 */

		if(true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
		
		
		}
	
		if(!true) {
			System.out.println("Hello1");
		}
	
		if(9<10) {
			System.out.println("Hi");
		}
	
		int a=1000;
		if (++a==1001) {
			a=2000;
			System.out.println("a is increased");
			System.out.println(a+"\n\n");
		}
	/*
	 	
	 
		if statement:
			single if: 
				if(condition) {
					some codes to run
				}
	
	*/
	
		int X= 987654320;
		if(X%2 == 0) {
			System.out.println("It is an even number.");
		}
	
		int Y = 123;
		if(Y%2 != 0) {
			System.out.println("It is an odd number.");
		}
	
	
		int yy = 2345678;
		if (yy%5 == 0) {
			System.out.println(" can be divided by 5.");
		}
		
		if (yy%5 != 0) {
			System.out.println(yy + " cannot be divided by 5.");
		
	
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss";
			
			System.out.println(CEO==Kuzzat);//true
			
			if(yy!=124558211) {
				System.out.println(Kuzzat + " is great");
			}
	
			if (Kuzzat!=CEO) {
				System.out.println("Greatest person in the world. Second if block");
			}
			
			int TotalNumber = 100;
			boolean Cybertek = true;
			boolean BestSchool = true;
			
			if (Cybertek==BestSchool) {
				TotalNumber +=500; //TotalNumber 600
				
			}
			
			if (Cybertek != BestSchool) {
				TotalNumber -=50; // not executed. the condition that provided is false.
			}
	
			System.out.println(TotalNumber);
			
			/*
			 1. Declare a variable and initialize user age
			 
			 */
			
			byte EligibleVoteAge = 18;
			byte UsersAge = 19;

			if (UsersAge>=EligibleVoteAge) {
				System.out.println("User can vote.");
			}
				else {
				System.out.println("Have fun with building the wall!");		

		}

		/*
		 * for (initialization condition; testing condition; 
		
        increment/decrement)
{
statement(s)
}

*/
		
		int num = 3, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);


		}
	}
}



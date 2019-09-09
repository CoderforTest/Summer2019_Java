package Day06_ArithmeticOperators;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* TASK4
		 * declare two variables:
int a =10;
int b= 15;
swipe those two variables value without using a temporary variable
Ex:
System.out.println(a); ===> 15
System.out.println(b); ===> 10
 
		 */
	int a = 10;
	int b = 15;
	
	a = a+b;//a=25
	b = a-b;//25-15=10 b=10
	a = a-b;//25-10=15 a=15
	
	
	
	System.out.println(a);
	System.out.println(b);
	
	
	
	/* TASK1
	 * * - declare 3 int variables:
            city1
            city2
            city3

- assign values to each of them.
            2345673
            5688944
            16189445

- print values in same line separated by space
            2345673  5688944  16189445
            
- use print method to print values in 3 different lines:
            2345673
            5688944
            16189445
		 */
	
	
	 int city1=2345673;
	 int city2=5688944;
	 int city3=16189445;
	 
	 System.out.println(city1+" "+city2+" "+ city3);
	 
	 System.out.println(city1 + "\n"+ city2 + "\n" + city3);

	}

}

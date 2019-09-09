package assignments;

public class Task04 {

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
		
		a = a+b;
		b = a-b;
		a = a-b;
					
		System.out.println(a);
		System.out.println(b);
		
	}

}

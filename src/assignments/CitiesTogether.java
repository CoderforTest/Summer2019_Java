package assignments;

public class CitiesTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a class CitiesTogether
Declare 3 String variables
            city1
            city2
            city3
Assign values:
            Tashkent
            Kyiv
            Moscow
            
            Print:
            From Tashkent to Kyiv is $500
            From Moscow to Tashkent is $550
            I have been to Tashkent, Moscow, Kyiv.
            
            
		 */

	
		String city1, city2, city3;
		city1 = "Tashkent";
		city2 = "Kyiv";
		city3 = "Moscow";
		
		char value1 = '$';
				
		int value2 = 500;
		int value3= 550;
		
				
		System.out.println("From " + city1 + " to " + city2 + " is " + value1 + value2);
		System.out.println("From " + city3 + " to " + city1 + " is " + value1 + value3);
		System.out.println("I have been to " + city1 + ", " + city3 + ", " + city2 +".");
	
	}

}
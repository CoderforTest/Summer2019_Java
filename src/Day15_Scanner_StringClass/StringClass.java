package Day15_Scanner_StringClass;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		input as string value
		String class:
		1. String is considered as an object.
		there are two ways to create object from String class:
			1. String literals
			String str = "Cybertek";
			2. by using "new" keyboard
			String str = new String("Cybertek");
			
 */
	
		String str = "Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		
		String str2 = new String("Cybertek");
			
		System.out.println(str==str2);
		
		String str3 = new String("Cybertek");
		System.out.println(str2==str3);

		/*
		 2. String object represents the sequence of characters.
		 	each character in a string has its own index number. index numbers start from zero.
		 3. String is immutable. once you declare it, you cannot modify it.
		 		 
		 */

	String str11 = "Cybertek";
 // index number:   01234567

	}

}

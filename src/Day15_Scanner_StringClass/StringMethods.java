package Day15_Scanner_StringClass;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 String methods:
		- charAt(indexnum):
		- length method: returns total number of characters as an int value
		- concat
		 */

	String str = "Cybertek";

	System.out.println(str.charAt(6));
	
	String name = "Donald J. Trump";
	System.out.println(name.length());
	int n = name.length();
	System.out.println(n);
	
	
	String s1 ="Cybertek";
	s1.concat(" School");
	
	s1 = s1.concat(" School");
	
	System.out.println(s1);
	
	// toUpperCase method
	
System.out.println(s1.toUpperCase());	


String nop = "Java";
String nope = nop.toUpperCase();

System.out.println(nope);


String name1 = "ABDURAHMAN";
name1 = name1.toLowerCase();

System.out.println(name1);

String a = "Batch 12 Javengers";
char b= a.charAt(9);

System.out.println(b);

int Length = a.length();
System.out.println(Length); // total of 18 characters. highest index is 17
int HighestIndexNum = a.length()-1;
System.out.println(HighestIndexNum);

	}

}
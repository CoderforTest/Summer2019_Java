package Day05_Recap;

public class Concatenation1 { //birbirine baglama

	/*
	 * String: represents sequence of characters, used for storing text.
	 * String values are surrounded by a double quote.
	 * Concatenation: combining, linking things together==> created a 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Any text goes here.";
		System.out.println(str);
		
		String str2="1";// 1 is a text here, not number.
		System.out.println(str2);
		
		String Hello="Hello World";
		System.out.println(Hello);
		
		String myName="Cybertek" + " " + "School";
		System.out.println(myName);
		
		String Year="This is " + 2019;
		System.out.println(Year);
		
		
		//example
		String name="Muhtar";
		System.out.println("My name is "+name);
		
		String name1="Kuzzat";
		System.out.println("My name is "+name1);
		
		/*
		 * 
		 
		cucumber is variable $
		tomato is variablename $
		*/
		
		int cucumber=3, tomato=5;
		System.out.println("Cucumber is " + '$' + cucumber);
		System.out.println("Tomato is " + '$' + tomato);
		
		String newStr="100"+10;
		System.out.println(newStr);
		
		System.out.println(1+2+3);
		
		System.out.println("1"+2+3); // ==> "12"+3 ==>123

		//System.out.println("1"+2-3); // does not compile. 1 is text, 1+2 is 12 and is text. but does not compile subtraction
		
		System.out.println("Batch 12"+1+2);
		
		System.out.println(2-1+1+"4");
		
		System.out.println("Batch 12"+ (1+2));
		
		System.out.println(1+"123"+4+5);
		
		System.out.println("123"+(4+5));
		
		System.out.println(1+("1"+2));
		
		System.out.println(1+"123"+(4+5));
		
		
		//String: char sequences, declared within " "
		
		// System.out.println((1+2) - "3"); does not compile, because of subtraction.
		
		
		
		System.out.println(1+2+"3");
		
		
	}

}

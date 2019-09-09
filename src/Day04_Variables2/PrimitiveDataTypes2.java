package Day04_Variables2;

public class PrimitiveDataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Primitives: byte, short, int, long, float, double, boolean, char
		 * boolean: takes either true or false expressions. you can also use operators which result true or false.
		 * char: declared within the single quote ''; single character only
		 */
		
		boolean result=true;
		boolean result2=false;
		boolean result3=9>3; 
		//boolean result
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		//boolean result= Earth is flat; does not accept
		// boolean num1=100; boolean only takes true or false results
		
		//char:
		char character1='a';
		//char char2='ab'; we cannot assign more than one character to char variable
		char char3='2';
		char char41='#';
		
		System.out.println(character1);

		//Welcome=>emocleW
		
		char char4 =67;// 67 is "C" in ASCII table.
		System.out.println(char4);
		// the only time we use '' for char is when we are declaring single character.
		
		char char5='C';
				
		System.out.println(char5);
		
		char char6 = '{';
		char char7 = 123;
		
		System.out.println(char6);
		System.out.println(char7);// prints the character that has the number of 123 from ASCII table.
		
		// initializing char to other primitives: byte, short, int, long, float, double
		char MyChar1     = 'b';
		//   variablename  value
		int MyInt = 'b'; // the number in ASCII that represents b is initialized to the int
		
		System.out.println(MyInt); //98
		
		char MyChar2 = 'b';
		int MyInt2 = MyChar2;
		System.out.println(MyInt2); //98

		/*
		*char Mychar22 = 'b';
		*byte Mybyte22 = Mychar22;
		*System.out.println(Mybyte22); //98
		*cannot convert from char to byte
		*/
		
		//short ShortNum=MyChar1;
		short ShortNum2= 'b';
		System.out.println(ShortNum2);
 
		float floatNum=MyChar1;
		float floatNum2='b';
		System.out.println(floatNum2);
		
		double doubleNum=MyChar1;
		double doubleNum2='b';
		System.out.println(doubleNum2);
		
		char myCharValue=2221;
		System.out.println(myCharValue);
		
		int    i = 100;                   



		//line 1


		float  f = 200f;             


		//line 2
		double d = 300L;      


		//line 3
                             





		//line 
		
	}

}

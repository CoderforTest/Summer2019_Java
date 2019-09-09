package Day05_Recap;

public class Quizzes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* multiple ways to declare main method:
		 * 1.public static void main(String[] args) {}
		 * 2.static public void main(String[] args) {}
		 * 3.public static void main(String... args) {}
		 */
		
		
		double b=5.5F;//double>float
		float num2=10;
		//float num3 =5.5; //cannot compile. double>float
		
		//double>float>long>int>short>byte
	
		int _variableName=19;
		int $VariableName2=20;
		//int %VariableName3 =40; doesnot compile. starts with %. it can only start with $ or _ 
		
		//1,000,000 doesnot compile.
		
		int vari = 1_000_000;
		
		System.out.println(vari);
		
		int iNum=10;
		long LNum=iNum;
		
		System.out.println(LNum);
		
		long LNum2=10L; // L is for Java compiler to recognize it. it prints only 10
		System.out.println(LNum2);
	
		float FNum=5.5F; // F is for Java compiler to recognize it. it prints only 5.5
		System.out.println(FNum);
	
	
		int myNum='A'; //this is a char value
		System.out.println(myNum);//prints the value of A in ASCII table
	
		int myNum2 = '9'; // this is a char value. its corresponding value in ASCII table is 57
		System.out.println(myNum2);
		
		//int myNum3='abc' // does not compile. must be a single character to be a char value.
	
		// boolean result='C'; does not compile. takes only true or false boolean expression
		
		//javac=java compiler
		
		// pwd: print working directory
		//ls: lists all the sources in the current directory

		//i=f; does not compile. int is smaller than float
		//f=d; does not compile. float is smaller than double
		//i=d; does not compile. int is smaller than double
		
		System.out.println("Today is great day\nFriday");
		System.out.println("\tToday is great day Friday");
		System.out.println("\\");
		
		System.out.println("\'Game of Thrones");
		System.out.println("Game of Thrones\'");
		System.out.println(" \'Game of Thrones\' ");
		
		String Bookname = "I like the book called \'Game of thrones\'";
		System.out.println(Bookname);
		
		String MyInfo="My name is \n\tCybertek";
		System.out.println(MyInfo);
		
		System.out.println('3' +3); // in ASCII table the representing number for three is 51. 
		System.out.println("3" +3);// first 3 is text, second 3 is also text.
		
		System.out.println("4"+'3');//char plays as a role of number because it comes after number 4
		
		System.out.println(12+'3');
		System.out.println('7'+3);
		
		System.out.println('7'+"3");
		
		System.out.println('7'+9);
		
		System.out.println("3"+'3');
		
		System.out.println('3'+"3");
		
		System.out.println(4+"3"+('3'+3));
				
	}

}
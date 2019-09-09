package Day07_UnaryShortHand;

public class CahootQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// question 01:
		int a = 30;
		//int b = (long) a; doesnot compile
		int b =(byte)a;
		
 
		System.out.println(b); //30
		
		/*
		 * question3
		 
		System.out.println("Result A" + 0 + 1);
		//"Result A01"; 0 and 1 are part of text
		System.out.println("; Result B" + (1)+(2));
		; "Result B12"
		
		System.out.println("Result B" + (1+2));
		"Result B3"
		
		*question4
		* 
		*System.out.println("5+2= " +3+4);
		"5+2= 3" + 4, "5+2 =34"
		
		System.out.println("5+2= " (3+4));
		"5+2= 7"
		
		question5
		float FloatNum=100.98765432f;
		short ShortNum=(int) FloatNum; still doesnot compile. short is smaller than int.
		short ShortNum=(byte) FloatNum; works. result 100
		short ShortNum=(short) FloatNum; works. result 100
		
		question6
		byte cannot exceed 127.
		
		question7
		System.out.println((3+2)*2/3%2);
		5*2/3%2
		10/3%2
		3%2
		1
		
		Priority
		 - ()
		 - multiplication, division, remainder (we do from left to right. they have priority over adding and subtraction. )
		 - adding, subtraction (we do from left to right)
		
		question10
		double result1=10/3;
		//     result1=3 ==> 3.0
		
		question12
		String str="10.5"; //string of text
		int num = (int) str; compile error. str is not primitive.
		
		question13:
		
		int I1=10, I2=20, I3=30;
		I1=I1%5; 10%5=0
		I2=I2%5; 20%5=0;
		System.out.println(I1 + "\t" + I2);
		
		*/
		
		System.out.println((double)10/3);
		System.out.println(10/(double)3);
		
		System.out.println(10D/3f);
	}

}
package Day07_UnaryShortHand;

public class ShorthandOperatorsTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10, y=20;
		System.out.println(x += y);
		
		int A=30, B=10;
		System.out.println(A -= B);
		
		int x2=2, y2=3;
		System.out.println(x2 *= y2);
		
		int AA=10, BB=2;
		System.out.println(AA /= BB);
		
		int x3=20, y3=3;
		System.out.println(x3 %= y3);
		
		System.out.println("=============");
		//Task1
		//Given int z= 198; • verify that the number of z is even number

		int z = 198;
		int OddOrEvenNumber = z % 2;
		
		System.out.println(OddOrEvenNumber);
		// the result is 0, it is even number.
		
		System.out.println("================");
				
		// Task2
		// byte a= 30; 
		// Int b = b+= a;   what’s the value of b ?
		
		// b=b=b+a
		byte a = 30; 
		int b=a;
		b =  b+a;
		
		System.out.println(b);
		
	}

}
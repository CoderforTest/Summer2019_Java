package Day08_ShortHandOperators;

public class QuizReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ivar = 100;
		double dvar = 200;
		float fvar = 300;
		//ivar = fvar; compile error. float>int
		fvar = ivar;
		dvar = fvar;
		// fvar = dvar; double>float
		// ivar = dvar;
		
		String str1 = "Result A" + 1 + 2;
		//"ResultA1" + 2 ==> "ResultA12"
	
		String str2="Result A" + 7 * 2;
		System.out.println(str2); //ResultA14
		
		String str3="Result A" + 7 + 2;
		System.out.println(str3);
	
		//String str4="Result A" + 7 - 2; //compile error
		//System.out.println(str4);
	
		String str5="Result A" + 7 * 2;
		System.out.println(str5);
			
		String str6="Result" + 8 / 2;
		System.out.println(str6);
	
		//str7="Result A" + 8 % 2; compilation error
		//System.out.println(str7);
		
		String str8="Result A" + (7 - 2);
		System.out.println(str8);
		
		//str9="Result A" + (8 % 2); 
		//System.out.println(str9);
		
		System.out.println("===============");
		
		//double J,K,L=10.5; they are declared within the method. they are local variables. compilation error.
		
		/*
		This works:
		double J,K,L;
		J=10.5;
		K=10.5;
		L=10.5;
		 */

		int x=10;
		int y = x++;// y=10, x=11
		System.out.println(y++ + " " + x++ + " " + y); // y=11, x=12
	//					   10		   11		   11
	}

}

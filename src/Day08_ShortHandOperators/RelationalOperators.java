package Day08_ShortHandOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Relational Operators: return boolean expression.
		 >  : greater than
		 >= : greater than or equal
		 <  : less than
		 <= : less than or equal
		 == : equal
		 != : not equal
		 
		  = : assign
		  ! : exclamation mark in java means the logical opposite.
		 */
		
	System.out.println(10>9);
	boolean ResultA = 10>9;
		
		System.out.println(ResultA);
		
		System.out.println(10>=9);
		
		boolean resultB = 10>=9;
		System.out.println(resultB);
		
		boolean resultC= 10<=9;
		System.out.println(resultC);
	
		boolean resultD=1100<1200;
		System.out.println(resultD);
		
		boolean resultE= 1000<1000;
		System.out.println(resultE);
		
		boolean resultF= 1000<=1000;
		System.out.println(resultF);
		
		// ==  represents equal
		
		boolean resultG = 19==19;
				System.out.println(resultG);
		
		boolean resultH= 1000<1000;
		System.out.println(resultH);
		
		boolean resultH1= 20!=20;
		System.out.println(resultH1);
		
		boolean A = ! false;
		System.out.println(A);
		
		boolean B = !true; //false
		
		/*
		 in java:
		 true == true,
		 false =  false
		 !false equals to true,
		 !true equals to false
		 therefore:
		 !false does not equal !true
		 */
		
		boolean C = !false != !true;
		System.out.println(C);
		
		boolean D = true == !false;
		System.out.println(D);
	
		boolean g = false;
		System.out.println(!g);
	
		System.out.println(!true ==false);
		
		boolean h = "Batch12" == "batch12";
		System.out.println(h);
		
		System.out.println("cybertek" != "Cybertek");
		
		System.out.println("==============");
		
		//Task1: given int z = 198; verify that z is even number
		
		
		int num =198;
		System.out.println(num%2);
		
		byte ByteNum =30;
		//int Inum= Inum += ByteNum;// we dont have any value for Inum yet. we must give value to local variables.
		
	}

}

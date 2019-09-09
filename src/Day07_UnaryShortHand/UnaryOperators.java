package Day07_UnaryShortHand;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(12/5f);
		System.out.println(10.5%3);
		
	System.out.println(10%6f);
	System.out.println("=================");
	
	/*
	 * +: positive
	 * -: negative
	 * ++: increment
	 * --: decrement
	 *
	 * +- ===> -
	 * -+ ===> -
	 * -- ===> +
	 * 
	 * increment: increases the value by 1
	 * 			  increments are 
	 * 				- pre increment: operator is placed before the variable. increases the value by 1 immediately
	 * 				- post increment: operator is placed after the variable. first uses current value and then increases it.
	 * 
	 * decrement: decreases the value by 1
	 * 
	 */

	int a = 10;
	int b = -10;
	
	System.out.println(b);
	
	int c = +b;
	System.out.println(c); 
	
	int d = -c;
	System.out.println(d);
	
	int f = -(10);
	System.out.println(f);
	
	System.out.println("=================");
	int num1=100;
	++num1;
	
	System.out.println(num1);
	System.out.println(++num1);
	
	System.out.println("=============");
	
	int IntNum = 100;
	System.out.println(IntNum++);//first it takes the current value, 100. at the next step it increases it.
	System.out.println(IntNum); //101
	
	int IntNum2=IntNum ++; //101
	
	System.out.println(IntNum);//102
	
	System.out.println("===========");
	
	
	int x = 100;
	int y= x++ -1;
	
	System.out.println(y);
	
	System.out.println("=============");
	/*
	 /decrement: decreases the value by 1
		pre decrement: operator is placed before the variable. decreases the value by 1 immediately
		post decrement: operator id placed after the variable. it will pass the current value and then will decrease the value by 1.
	 */
	
	int Z=100;
	
	System.out.println(Z);
	System.out.println(--Z);
	
	System.out.println("=============");
	int yy=95;
	System.out.println(yy--);

	System.out.println(yy--);
	
	
	int T=25;
	System.out.println(++T);
	System.out.println(--T);
	
	System.out.println("================");
	
	int P=50;//49,50,  49,   50
	P = --P + P++ + P-- + P++;
	//	 pre  post  post  post
	 //  49  + 49 + 50 +  49 = 197

	System.out.println(P);
	
	System.out.println("=================");
	
	short Snum=4;//3
	int R= Snum * 4 - Snum--;
			// 16      -4
	
	System.out.println(R);
	
	int W = 1; //0,1,0,-1
	    W = - W-- +   W++ / -W-- * --W;
	   // 	post	 post	post	pre
	    //   - 1 +      0   / -1    * -1
	    //-1 + 0 * -1 = -1 + 0 = -1
	  System.out.println(W);  
	    
	    }
}

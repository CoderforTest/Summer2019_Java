package Day07_UnaryShortHand;

public class UnaryOperatorsTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.
		
		int x=2;
		int y=x++; //post increment, y=2; x=3
		System.out.println(y + " " + x);
		
		//2.
		int x2=2;
		System.out.println(x2++); //2
		System.out.println(x2); //3
		
		//3. 
		int x3=2;
		System.out.println(--x3);//2-1=1, pre: decreases the value by 1 immediately
		
		//4.
		int x4=8;
		int y4=x4--; //8, y4=8, x4=7
		System.out.println(y4);
		System.out.println(x4);
		
		//5.
		
		int a=1;
		a = -a-- + a++ / -a-- * --a;
		//  -1   + 0   / -1   *  -1
		//   0	   1      0      -1
		
		System.out.println(a);
		
		//6.
		int aa = 50;
		aa = --aa + aa++ + aa-- + aa++;
		//	   49 + 49   + 50   + 49
		// 	   49	50	   49     50
		System.out.println(aa);
		
		//
		int xx = 4;
		int yy = xx * 4 - xx++;
		//		 16     - 4 = 12
		//				  5
		System.out.println(yy);
		
		
		
	}

}

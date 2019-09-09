package Day08_ShortHandOperators;

public class ShortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 += : addition assignment
		 -= : subtraction assignment
		 *= : Multiplication assignment, x*=y ==> x=x*y
		 */
		
		
		
		 int a =9;
		// a=a+3; //12
		 
		 //or
		 
		 a += 3; //12
		 

	
	System.out.println(a); //12

	int b= a += 5;
	// 12+=5 ==> 12+5 ==> 17 ,     a=17, b=17
	System.out.println(b);
	
	int c = a += b; //c=    a= a+b, a= 17+17; a=34, c=34
	System.out.println(c);
	System.out.println(a);
	
	int d = a+=c; //  d=    a= a+c, a=34+34, a=68, d=68, c=34, b=17
	
	int e= (d+=b)*2; //    d=d+b,      d=68+17,       d=85, e=(d+=b)*2
	//     (68+17) *2
	//
	
	System.out.println(e);
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);
	
	//int f = b +=d
	
	System.out.println("===============");
	
	// -=
	
	int g=101;
	int h = g-=1;
	System.out.println(h);
	System.out.println(g);
	
	int i = g+=h+5;//g=205, i=205, h=100
	System.out.println(i);
	
	int j = h+= g%i;
	      //100+=205%205
	      //100+=0, 100=100+0
	System.out.println(j);

	int k = j -= h * 2 % 5;
			j -= 100*2 %5; //j=j-0
			System.out.println(k);
	
	System.out.println("===============");
	int A = 100;
	A*=200;
	System.out.println(A);
	
	int B=100;
	    B*=100/10;
	    System.out.println(B);
	
	B *= B - 1000;
	
	//   B *= 1000-1000        
	//   B = B * 0
	//	 B=1000*0
	
	System.out.println(B);
	
	System.out.println("==================");
	
	// /=:
	
	int C= 1000;
	C/=5;
	System.out.println(C); //200
	
	int D=10;
	//C /= D-10; //  C= C/D-20 denominator cant be 0
	C/=D+10;
	//C = C/ D+10;
	//C = C/20
	System.out.println(C);
	
	
	System.out.println("====================");
	
	//%=
	
	int z = 10%3; 
	/*
	 * remainder cant be negative.
	 * when we divide a number there will be either remainder or ...
	 */
	int E=10;
	E %=2;
	System.out.println(E);
	
	int F=100;
	F%=2; 
	System.out.println(F);
	
	System.out.println(-100%3);
	
	double aa=10.5;

	double bb = (int) aa;
	
	System.out.println(bb);
	System.out.println(aa);
	
	System.out.println(aa%3);
	
	int J=300;
	int K=10;
	
	J += J % K;//
	//J += 0
	
	System.out.println(J);
			
	
	}

}

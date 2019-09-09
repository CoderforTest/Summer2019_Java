package Day05_Recap;

public class Primitives_Review1 {

	public static void main(String[] args) {
		
	byte bNum = 127;
	//byte bNum2=126.5; does not compile

	boolean result=true;
	boolean result2=false;
	boolean result3=9>10;
	
	System.out.println(result3);
	
	System.out.println();
	
	long aaa = 100000000000000000L;
	System.out.println(aaa);
	long ccc = 2000000000000000l;
	System.out.println(ccc);
	float bbb = 250000;
	System.out.println(bbb);
	
	//char: takes character, char values must be declared within single...
	
	char character1 ='A';
	System.out.println(character1);
			
	
	//char character3='AA';//invalid character constraint
	
	System.out.println('Q');
			/* 8,9,#,@, 8.5
			 * 
			 * 
			 */

	//8:
	byte Bnum=8; short Snum=8; int Inum=8; long Lnum=8; float Fnum=8; double Dnum=8;
	
	char character='8';
	
	System.out.println(Bnum);
	System.out.println(Snum);
	System.out.println(Inum);
	System.out.println(Lnum);
System.out.println(Fnum);

System.out.println(Dnum);

System.out.println(character);
	
char character44 = '7';
System.out.println(character44);
	}
}
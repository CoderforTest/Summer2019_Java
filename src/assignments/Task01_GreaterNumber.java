package assignments;

public class Task01_GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 You have 3 variables num1, num2, max

assign value of larger one into variable max 


Ex:
if: int num1 = 20;  int num3= 30
then   int max=30;

if: num1 = 40;  num3 = 100;
then:  max= 100;
		 */

		int num1=20;
		int num3=30;
		int max=0;
		
		if (num1>num3) {
			max = num1;
		}
		else {
			max=num3;
		}
		
		
		System.out.println("max = " + max);
	}
}
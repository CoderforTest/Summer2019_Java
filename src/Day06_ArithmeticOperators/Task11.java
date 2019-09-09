package Day06_ArithmeticOperators;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.   Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas: 
		 * perimeter = 2 * radius * ð?œ‹ 
		 * area = radius * radius * ð?œ‹
		 */

		double radius = 5.5;
		double pi = 22/7;
				
		double perimeter = 2*radius*pi;
		double area = radius*radius*pi;
		
		System.out.println(area);
		System.out.println(perimeter);	
		
	}

}

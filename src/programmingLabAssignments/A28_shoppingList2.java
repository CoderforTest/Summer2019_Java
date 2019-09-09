package programmingLabAssignments;

import java.util.Scanner;

public class A28_shoppingList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item1, item2, item3, report;
		Double price1, price2, price3, totalPrice;
		int count1, count2, count3;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		item1=scan.nextLine();
		count1=scan.nextInt();
		price1=scan.nextDouble();
				
		System.out.println("Enter Item2, count and its price:");
		item2=scan.next();
		count2=scan.nextInt();
		price2=scan.nextDouble();
				
		System.out.println("Enter Item3, count and its price:");
		item3=scan.next();
		count3=scan.nextInt();
		price3=scan.nextDouble();
		
		Double cost1=1.0;
		Double cost2=2.0;
		Double cost3=3.0;
		
		if (count1>=0) {
			cost1 = price1*count1;
		}
		else {
		}
		
		if (count2>=0) {
			cost2 = price2*count2;
		}
		else {
		}
		
		if (count3>=0) {
			cost3 = price3*count3;
		}
		else {
		}
		
		totalPrice = cost1 + cost2 + cost3;
		
			
		String report1 = "";		
		String report2 = "";
		String report3 = "";
		
		if (count1>0) {
			report1 = "Item1: " + item1 + " Price: " + cost1;
		}
		else {
		}
		
		if (count2>0) {
			report2 = "Item2: " + item2 + " Price: " + cost2;
		}
		else {
		}
	
		if (count3>0) {
			report3 = "Item3: " + item3 + " Price: " + cost3;
		}
		else {
		}
			

		
	report = report1 + ", " + report2 + report3;
	
System.out.println(report);
System.out.println("Total price: " + totalPrice);
	
		}
	
	}

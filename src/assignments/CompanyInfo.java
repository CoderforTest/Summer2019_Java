package assignments;

public class CompanyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a class CompanyInfo
Declare variables:
            companyName
            address
            numberOfEmployees
            revenue
            isTechCompany
Print statements and describe each value:
            Company name is Facebook
            address is ...
            Number of employees is 100
            Annual revenue is 4 000 000
            is it tech company? - true
		 */
	
		String companyName = "Facebook";
		String address = "Silicon Valley";
		int numberOfEmployees = 100;
		int revenue = 4_000_000;
		Boolean isTechCompany = true;
		
		System.out.println("Company name is " + (companyName));
		System.out.println("Address is " + address);
		System.out.println("Number of employees is " + numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("is it tech company?" + " - " + isTechCompany);
	
	}

}
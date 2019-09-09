package assignments;

public class Task02_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 In this assignment, you will write code to put together time of day.
Like this: 12:24:33 PM

1. Declare variables: hour, minute, second that can hold int values.
2. Declare amOrPm variable that can hold a String ("AM" or "PM")
3. Using the variables and concatenation, print values in the format mentioned above.
		 */

	int hours=1;
	int minutes=4;
	int seconds=33; 

	String amOrPm="AM";
	
		if (0<=hours && hours<=9) {
		System.out.print("0" + hours);
	}
	
		else if (0<=minutes && minutes<=9) {
			System.out.print(":" + "0" + minutes);
		}
	
		else if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
	
		else if (10<=minutes && minutes<=59) {
			System.out.print(":" + "0" + minutes);
		}
		else if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
		
		
		else if (10<=hours && hours<=11) {
		System.out.print("0" + hours);
}
			
		else if (0<=minutes && minutes<=9) {
			System.out.print(":" + "0" + minutes);
		}
			
		else if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
					
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else if (10<=minutes && minutes<=59) {
			System.out.print(":" + "0" + minutes);
		}
		else if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
					
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
				
					
		else if (hours==12) {
		System.out.print("0" + hours);
	}
					
		else	if (0<=minutes && minutes<=9) {
				System.out.print(":" + "0" + minutes);
			}
					
		else	if (0<=seconds && seconds<=9) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
				}
							
		else if (10<=seconds && seconds<=59) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
				}
					
		else	if (10<=minutes && minutes<=59) {
				System.out.print(":" + "0" + minutes);
			}
		else	if (0<=seconds && seconds<=9) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
				}
							
		else if (10<=seconds && seconds<=59) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
				}			

			
		else if (12<hours && hours<=21){
		System.out.print("0" + hours);
	}
	
		else	if (0<=minutes && minutes<=9) {
			System.out.print(":" + "0" + minutes);
		}
	
		else	if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
	
		else	if (10<=minutes && minutes<=59) {
			System.out.print(":" + "0" + minutes);
		}
			
		else	if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else if (10<=seconds && seconds<=59) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}			
	
			
		else if (22<=hours && hours<=23){
			System.out.print("0" + hours);
	}
			
		else	if (0<=minutes && minutes<=9) {
			System.out.print(":" + "0" + minutes);
		}
			
		else	if (0<=seconds && seconds<=9) {
				System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
					
		else if (10<=seconds && seconds<=59) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
			
		else	if (10<=minutes && minutes<=59) {
					System.out.print(":" + "0" + minutes);
		}
		else	if (0<=seconds && seconds<=9) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
			}
					
		else if (10<=seconds && seconds<=59) {
					System.out.println(":" + "0" + seconds + " " + amOrPm);
			}			
			
				
				
		else if (((hours<0) || (hours>23)) || ((minutes<0) || (minutes>59)) || ((seconds<0) || (seconds>59))) {
		System.out.println("Invalid transaction.");
	}	
	

	
	
	/*
	if ((0<=hours && hours<=9) && (0<=minutes && minutes<=9) && (0<=seconds && seconds<=9)) {
		amOrPm=amOrPm;
		System.out.println("0" + hours + ":" + "0" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}

	else if ((0<=hours && hours<=9) && (0<=minutes && minutes<=9) && (10<=seconds && seconds<=59)) {
		amOrPm=amOrPm;
		System.out.println("0" + hours + ":" + "0" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	else if ((0<=hours && hours<=9) && (10<=minutes && minutes<=59) && (0<=seconds && seconds<=9)) {
		amOrPm=amOrPm;
		System.out.println("0" + hours + ":" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}
	
	else if ((0<=hours && hours<=9) && (10<=minutes && minutes<=59) && (10<=seconds && seconds<=59)) {
		amOrPm=amOrPm;
		System.out.println("0" + hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	
	
	if ((10<=hours && hours<=11) && (0<=minutes && minutes<=9) && (0<=seconds && seconds<=9)) {
		amOrPm=amOrPm;
		System.out.println(hours + ":" + "0" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}

	else if ((10<=hours && hours<=11) && (0<=minutes && minutes<=9) && (10<=seconds && seconds<=59)) {
		amOrPm=amOrPm;
		System.out.println(hours + ":" + "0" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	else if ((10<=hours && hours<=11) && (10<=minutes && minutes<=59) && (0<=seconds && seconds<=9)) {
		amOrPm=amOrPm;
		System.out.println(hours + ":" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}
	
	else if ((10<=hours && hours<=11) && (10<=minutes && minutes<=59) && (10<=seconds && seconds<=59)) {
		amOrPm=amOrPm;
		System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	
	if ((hours==12) && (0<=minutes && minutes<=9) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		System.out.println(hours + ":" + "0" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}

	else if ((hours==12) && (0<=minutes && minutes<=9) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		System.out.println(hours + ":" + "0" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	else if ((hours==12) && (10<=minutes && minutes<=59) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		System.out.println(hours + ":" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}
	
	else if ((hours==12) && (10<=minutes && minutes<=59) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	
	if ((12<hours && hours<=21) && (0<=minutes && minutes<=9) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println("0" + hours + ":" + "0" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}

	else if ((12<hours && hours<=21) && (0<=minutes && minutes<=9) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println("0" + hours + ":" + "0" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	else if ((12<hours && hours<=21) && (10<=minutes && minutes<=59) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println("0" + hours + ":" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}
	
	else if ((12<hours && hours<=21) && (10<=minutes && minutes<=59) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println("0" + hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	}

	
	if ((22<=hours && hours<=23) && (0<=minutes && minutes<=9) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println(hours + ":" + "0" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}

	else if ((22<=hours && hours<=23) && (0<=minutes && minutes<=9) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println(hours + ":" + "0" + minutes + ":" + seconds + " " + amOrPm);
	}
	
	else if ((22<=hours && hours<=23) && (10<=minutes && minutes<=59) && (0<=seconds && seconds<=9)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println(hours + ":" + minutes + ":" + "0" + seconds + " " + amOrPm);
	}
	
	else if ((22<=hours && hours<=23) && (10<=minutes && minutes<=59) && (10<=seconds && seconds<=59)) {
		amOrPm="PM";
		hours=hours-12;
		System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	}
		
	
	if (((hours<0) || (hours>23)) || ((minutes<0) || (minutes>59)) || ((seconds<0) || (seconds>59))) {
		 
		System.out.println("Invalid transaction.");
	*/	
	}
	
	
	}
	

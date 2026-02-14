package BasicPrograms;

public class LeapYear {
	
	/* Rules for leap year
	 * Rule 1: If year divisible by 4, it might be leap year
	 * Rule 2: if year divisible by 100, it's not leap year
	 * Rule 3: Unless it is divisible by 400, then it's leap year
	 */
	
	public static void main(String[] args) {
		checkLeapYear(2024);
		checkLeapYear(1800);
		checkLeapYear(2000);
		checkLeapYear(2026);

	}
	 public static void checkLeapYear(int year) {
		 if(year%4 == 0 ) {
			 if(year%100 == 0) {
				 if(year%400 == 0) {
					 System.out.println(year +" is a leap year");
				 }else {
					 System.out.println(year +" is not a leap year");
				 }
			 } else {
				 System.out.println(year +" is a leap year");
			 }
		 }else {
			 System.out.println(year +" is not a leap year");
		 }
	 }

}

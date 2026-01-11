package BasicPrograms;

public class ArmstrongNumber {
	// An Armstrong number is a positive m-digit number that is equal to the sum of
	// the mth powers of their digits. It is also known as pluperfect, or Plus
	// Perfect, or Narcissistic number.
	//	1: 11 = 1
	//	2: 21 = 2
	//	3: 31 = 3
	//	153: 13 + 53 + 33 = 1 + 125+ 27 = 153
	//	125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
	//	1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
	// Note that there is no two-digit Armstrong number.
	
	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		// assigning n into a temp variable
		temp = n;
		// loop execute until the condition becomes false
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			// determines the last digit from the number
			last = temp % 10;
			// calculates the power of a number up to digit times and add the resultant to
			// the sum variable
			sum += (Math.pow(last, digits));
			// removes the last digit
			temp = temp / 10;
		}
		// compares the sum with n
		if (n == sum)
			// returns if sum and n are equal
			return true;
		// returns false if sum and n are not equal
		else
			return false;
	}
	
	static void checkArmstrong(int n) {
		if(isArmstrong(n)) {
			System.out.println(n+" is Armstrong number");
		}else {
			System.out.println(n+" is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		int number = 9999;
		System.out.println("Armstrong Number up to "+ number + " are: ");  
		for (int i=0; i<=number; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+"\t");
			}
		}
		
		System.out.println();
		checkArmstrong(371);
		checkArmstrong(1678);
		
	}

}

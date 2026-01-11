package BasicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// 1. Using third operator
		System.out.println("Swap Numbers Using third operator");
		int n1, n2, n3;
		n1 = 23;
		n2 = 65;
		System.out.println("Before Swapping numbers: n1= " + n1 + " and n2= " + n2);
		n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After Swapping numbers: n1= " + n1 + " and n2= " + n2);
		System.out.println();

		// 2. without using 3rd operator
		System.out.println("Swap Numbers without Using third operator");
		int a = 87;
		int b = 789;
		System.out.println("Before Swapping numbers: a= " + a + " and b= " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping numbers: a= " + a + " and b= " + b);
		System.out.println();

		// 3. Using Bitwise operator
		System.out.println("Swap Numbers Using Bitwise operator");
		int x = 673;
		int y = 1234;
		System.out.println("Before Swapping numbers: x= " + x + " and y= " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After Swapping numbers: x= " + x + " and y= " + y);
		System.out.println();

		// 4. Greatest common factor (GCD) of two numbers
		int o = 12;
		int p = 8;
		int gcd = 1;
		for (int i = 1; i <= o && i <= p; i++) {
			if (o % i == 0 && p % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("GCD of %d and %d is: %d", o, p, gcd);
		System.out.println();

		// 5. Largest and smallest number from three numbers
		int j = 23;
		int k = 11;
		int l = 67;
		int temp = j > k ? j : k;
		int largest = l > temp ? l : temp;
		System.out.printf("Largest numbers between %d, %d and %d is %d%n", j, k, l, largest);
		
		
		int tem = j < k ? j : k;
		int smallest = l < tem ? l : tem;
		System.out.printf("Smallest numbers between %d, %d and %d is %d%n", j, k, l, smallest);
		
		
	}

}

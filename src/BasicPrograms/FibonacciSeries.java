package BasicPrograms;

public class FibonacciSeries {
	static int n1=0, n2=1, n3=0;
	
	public static void printFibonacci(int count) {
		// Using Recursion
		if(count>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
			printFibonacci(count-1);
		}
	}
	
	public static void fibonacciMethod(int count) {
		System.out.println("Print Using Normal Java Method");
		System.out.print(n1 + " "+ n2);
		for(int i=2; i<count; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
		}
	}
	
	public static void resetvalues() {
		n1 = 0;
		n2 = 1;
		n3 = 0;
	}
	
	public static void main(String[] args) {
		int count = 10;
		System.out.println("Print Using Recursion Method");
		System.out.print(n1 + " "+ n2);
		printFibonacci(count-2); //n-2 because 2 numbers already printed
		
		System.out.println();
		resetvalues(); 
		fibonacciMethod(count);
	}

}

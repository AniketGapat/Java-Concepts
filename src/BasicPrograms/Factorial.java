package BasicPrograms;

public class Factorial {
	
	static int factorial(int n) {  
		if(n<0){
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		else if (n == 0)  
            return 1;  
        else  
            return (n * factorial(n - 1));  
    }  
	public static void main(String[] args) {
		System.out.println("Print Using FOR Loop");
		int i,fact = 1;
		int number = 5;
		for(i=1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
		
		System.out.println();
		System.out.println("Print Using WHILE Loop");
		int n = 6;
		int res = 1;
		int j=1;
		while(j<=n) {
			res *= j; // res = res * j;
			j++;
		}
		System.out.println("Factorial of "+n+" is: "+res);
		
		System.out.println();
		System.out.println("Print Using DO-WHILE Loop");
		int num = 7;
		int sum = 1;
		int k=1;
		do {
			sum*= k;
			k++;
		}while(k<=num);
		System.out.println("Factorial of "+num+" is: "+sum);
		
		System.out.println();
		System.out.println("Print Using Recursion Method");
		int num1 =4;
		System.out.println("Factorial of "+num1+" is: "+factorial(num1));
		System.out.println("Factorial of "+0+" is: "+factorial(0));
		System.out.println("Factorial of "+-2+" is: "+factorial(-2));
	}
}

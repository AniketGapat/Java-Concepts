package BasicPrograms;

public class ASCIIValues {
//	There are two ways to print ASCII value in Java:
//
//	1.	Assigning a Variable to the int Variable
//	2.	Using Type-Casting
	
	public static void main(String[] args) {
		int ch1 = 'a';  
		int ch2 = 'b'; 
		// Type-casting is a way to cast a variable into another datatype.
		System.out.println("The ASCII value of " + (char)ch1 + " is: "+ch1);  
		System.out.println("The ASCII value of " + (char)ch2 + " is: "+ch2);
		
		char ch3 = 'a';
		char ch4 = 'b';
		System.out.println("The ASCII value of " + ch3 + " is: "+(int)ch1);  
		System.out.println("The ASCII value of " + ch4 + " is: "+(int)ch2);
		
		System.out.println("All ASCII values of all chanracters and symbols as follows:");
		for(int i=0; i<=255; i++) {
			System.out.println("The ASCII value of " + (char)i + " is: "+i);
		}
	}

}

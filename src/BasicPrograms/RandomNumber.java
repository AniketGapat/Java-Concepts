package BasicPrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//Generating Random Number using Math.random method
		System.out.println("1st Random Number: "+ Math.random());
		System.out.println("2nd Random Number: "+ Math.random());
		System.out.println("3rd Random Number: "+ Math.random());
		System.out.println("4th Random Number: "+ Math.random());
		
		//Generate random number between 100 and 999
		int min=100, max=999;
		System.out.println("Random Double Numbers Between "+ min +" and "+ max +" are: ");
		double a = Math.random()*(max-min+1)+min; // this gives random number in double format
		System.out.println(a);
		
		System.out.println("Random Int Numbers Between "+ min +" and "+ max +" are: ");
		int b = (int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		//Using Random Class
		// creating an object of Random class   
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		// Prints random integer values  
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);   
		// Generates Random doubles values  
		double c = random.nextDouble();   
		double d = random.nextDouble();   
		// Prints random double values  
		System.out.println("Randomly Generated Double Values");  
		System.out.println(c);   
		System.out.println(d);    
		// Generates Random float values  
		float f=random.nextFloat();  
		float i=random.nextFloat();  
		// Prints random float values  
		System.out.println("Randomly Generated Float Values");  
		System.out.println(f);   
		System.out.println(i);   
		// Generates Random Long values  
		long p = random.nextLong();   
		long q = random.nextLong();   
		// Prints random long values  
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		System.out.println(q);    
		// Generates Random boolean values  
		boolean m=random.nextBoolean();  
		boolean n=random.nextBoolean();  
		// Prints random boolean values  
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);   
		System.out.println(n);   
	}

}

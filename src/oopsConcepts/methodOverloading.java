package oopsConcepts;

public class methodOverloading {
	
	public static void addition(int a, int b) {
		System.out.println(a+b);
	}
	//method overloading
	public static void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		methodOverloading.addition(5,10);
		methodOverloading.addition(5,10,15);
	}
	
	//main method overloading, JVM will only execute original main method
	public static void main() {
		System.out.println("I am inside method overloading");
	}
}

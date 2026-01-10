package javaKeywords;

public class staticClass {
	//static block
	static {
		int i =10;
		System.out.println("inside static: "+i);
	}
	
	
	static int no = 10;
	public static void printStaticMethod() {
		System.out.println("Static Method");
	}

	//static class
	static class nestedClass{
		static int number = 20;
		int rN = 2;
		public static void nestedPrintStaticMethod() {
			System.out.println("Static Method");
		}
		void print() {
			System.out.println("hello! I am nested class");
		}
	}
	
	public static void main(String[] args) {
		staticClass.nestedClass obj = new staticClass.nestedClass(); //nested class object
		System.out.println(nestedClass.number);
		System.out.println("Static member value : "+staticClass.no); //static variable
		staticClass.printStaticMethod();
	}
}

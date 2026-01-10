package oopsConcepts;

public abstract class methodOverriding {
	//non abstract method
	public static void print() {
		System.out.println("Hello I am main");
	}
	//abstract method
	public abstract void printHello();

	public static void main(String[] args) {
		
	}
}

class C extends methodOverriding{

	@Override
	public void printHello() {
		System.out.println("Overridden method");
	}
	//@Override //not possible as method is static 
	public static void print() {
		System.out.println("Hello I am C");
	}
	
	//@Override
	//public static void main(String[] args) {//not possible
		
	public static void main(String[] args) {
		C obj = new C();
		print(); //static method overriding
		obj.printHello();
		
		//methodOverriding ob = new methodOverriding();//not possible as we can not create object or instantiate abstract class
	}
}


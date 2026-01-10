package oopsConcepts;

public class polymorphism {

	// method overloading
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// method overloading
	public void add(int a, double b) {
		System.out.println("double data type value : " + (a + b));
	}

	// method overriding
	public void print() {
		System.out.println("I am parent");
	}
}

class otherPoly extends polymorphism {

	public void add() {
		System.out.println("Use of super keyword : ");
		super.add(10, 20); // another form of polymorphism
	}

	// method overriding
	@Override
	public void add(int a, int b) {
		System.out.println("overriden method: " + (a + b));
	}

	// method overriding
	public void print() {
		System.out.println("I am child");
	}

	public static void main(String[] args) {
		polymorphism obj = new polymorphism();
		obj.add(2, 2.5);
		otherPoly object = new otherPoly();
		object.add();
		object.add(20, 20);
		object.print();
	}
}
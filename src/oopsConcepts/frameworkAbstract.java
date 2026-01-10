package oopsConcepts;

interface shape{
	void circle();
	void triangle();
}

interface draw{
	void draw();
}

public abstract class frameworkAbstract {

	public abstract void start();
	public abstract void end();
	
	public void printHello() {
		System.out.println("Hello this is non-abstract method abstract class");
	}
	
	public static void main(String[] args) {
		
	}
	
}

class implementationAbstract extends frameworkAbstract implements shape,draw{ //can implement multiple interface

	@Override
	public void start() {
		System.out.println("I am in start");
	}

	@Override
	public void end() {
		System.out.println("I am in end");
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		printHello(); //calling non-abstract method without creating object
	}

	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inherited from draw");
	}
	
	public static void main(String[] args) {
		draw d = new implementationAbstract();
		d.draw();
	}
	
}
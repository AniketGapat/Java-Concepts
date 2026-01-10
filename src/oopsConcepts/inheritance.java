package oopsConcepts;


public class inheritance {
	int i = 10;
	
	public void print() {
		System.out.println(i);
	}
}
//single level inheritance
class child extends inheritance{
	
	public void print() {
		System.out.println(i);
	}
}

//multilevel inheritance
class childOfChild extends child{
	public void print() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		childOfChild obj = new childOfChild();
		obj.print();
	}
}

//hierarchical inheritance parent class has 2 childs - child, anotherChild
class anotherChild extends inheritance{
	
	public void print() {
		System.out.println(i);
	}
}

/*
//multiple Inheritance is not allowed in java as 
class A extends child,anotherChild{ //suppose this was allowed
	
	public void print() {
		A obj = new A();
		obj.print(); //it will get confused about whose method it should call child's or anotherChild's
	}
}
*/


//aggregation
class b{
	inheritance var;
	
	public void print() {
		var = new inheritance();
		var.print();
	}
	
	public static void main(String[] args) {
		b obj = new b();
		obj.print();
	}
}
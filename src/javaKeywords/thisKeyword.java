package javaKeywords;

public class thisKeyword {
	int a, b,c;
	
	thisKeyword(int a,int b){
		this.a = a;
		this.b = b;	
		this.sub(a, b);
	}
	//constructor overloading
	thisKeyword(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.sum(); //this keyword use to call method of current class
	}
	
	public void sum() {
		int sum;
		sum = a + b;
		System.out.println("Sum of 2 numbers: "+sum);
	}
	
	public void sum3() {
		int sum;
		sum = a + b + c;
		System.out.println("Sum of 3 numbers: "+sum);
	}
	
	public void sub(int a,int b) {
		int sub;
		sub = a - b;
		System.out.println("Value of a"+a);
		System.out.println("Value of b"+b);
		System.out.println("Substraction of 2 numbers: "+sub);
	}

}

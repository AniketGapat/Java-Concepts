package javaKeywords;

public class thKey {
	int a, b,c;
	
	public void sum() {
		int sum;
		sum = a + b;
		System.out.println("Sum of 2 numbers: "+sum);
	}
	
	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword(10,50);
		obj.sum();
		obj.sub(20, 10);
		thisKeyword obj2 = new thisKeyword(20,60,23);
		obj2.sum3();
	}
}

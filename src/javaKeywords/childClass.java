package javaKeywords;

public class childClass extends finalParent{

	public void printChild() {
		System.out.println(""+super.no);
	}
	
	//public void print() { //not possible to override parent method as its final
		//super.no = 20; //not possible to modify final variable
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass obj = new childClass();
		obj.printChild();
	}

}

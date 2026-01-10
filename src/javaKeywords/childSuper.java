package javaKeywords;

public class childSuper extends superParent{
	
	childSuper(){
		super(); //prent constructor calling
	}
	
	public void print() {
		System.out.println(super.no); //parent variable calling
		super.print(); //parent method calling
	}

	public static void main(String[] args) {
		childSuper obj = new childSuper();
		obj.print();
	}

}

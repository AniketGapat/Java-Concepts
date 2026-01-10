package javaKeywords;

public class staticOther extends staticClass{

	public static void main(String[] args) {
		staticOther obj = new staticOther();
		printStaticMethod();
		
		staticClass.nestedClass object = new staticClass.nestedClass();
		printStaticMethod();
		object.print();
		object.nestedPrintStaticMethod();
	}

}

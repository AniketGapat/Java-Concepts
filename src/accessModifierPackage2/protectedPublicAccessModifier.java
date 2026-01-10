package accessModifierPackage2;

import accessModifierPackage1.publicAccessModifier;

//public class protectedPublicAccessModifier extends defaultAccessModifier{//not possible as default can not 
	//be accessible outside of package

//we can not access private variable outside class and default variable outside of package
public class protectedPublicAccessModifier extends publicAccessModifier{
	public static void main(String[] args) {
		protectedPublicAccessModifier obj = new protectedPublicAccessModifier();
	//	System.out.println("Private number : "+obj.number); //giving error as private members can be accessible only within class
		System.out.println("Protected number : "+obj.no); 
		System.out.println("Public number : "+obj.num);
	//	System.out.println("Default number : "+obj.nmbr); //giving error as default members can be accessible only within package
	}
}

class protectedAccessModifier {
	public static void main(String[] args) {
		publicAccessModifier obj = new publicAccessModifier();
		// System.out.println("Private number : "+obj.number); //giving error as private members can be accessible only within class
		// System.out.println("Protected number : "+obj.no); //giving error as protected can be accessible outside package through subclass only
		   System.out.println("Public number : "+obj.num);
		// System.out.println("Default number : "+obj.nmbr); //giving error as default members can be accessible only within package
	}
}
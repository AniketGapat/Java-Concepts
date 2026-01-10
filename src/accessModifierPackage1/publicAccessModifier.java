package accessModifierPackage1;

public class publicAccessModifier {

	private static int number = 10;
	protected int no = 5;
	public int num = 50;
	int nmbr = 100;
	
	public static void main(String[] args) {
		publicAccessModifier obj = new publicAccessModifier();
		System.out.println("Private number : "+obj.number); 
		System.out.println("Protected number : "+obj.no);
		System.out.println("Public number : "+obj.num);
		System.out.println("Default number : "+obj.nmbr);
	}

}

//Protected, Public and default can be accessible within different classes of package
class defaultAccessModifier extends publicAccessModifier{
	
	public static void main(String[] args){
		publicAccessModifier obj = new publicAccessModifier();
		//System.out.println("Private number : "+obj.number);// this is not possible as private members can be accessible only within class
		System.out.println("Protected number : "+obj.no);
		System.out.println("Public number : "+obj.num);
		System.out.println("Default number : "+obj.nmbr);
	}
}

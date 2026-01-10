package oopsConcepts;

public class encapsulation {

	private String name;
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//System.out.println(encapsulation.getName());
	}
}

class A extends encapsulation{
	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
		obj.setName("Monali");
		System.out.println(obj.getName());
	}
}

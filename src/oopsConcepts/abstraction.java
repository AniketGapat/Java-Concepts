package oopsConcepts;

//abstract class
abstract class father{
	public abstract void name();
	
	public void printNM() {
		System.out.println("I am father");
	}
}

//abstract class
abstract class mother extends father{
	public abstract void name();
	
	public void printNM() {
		printNM();
		System.out.println("I am mother");
	}
}

//interface
interface colour{
	public String getFavCol();
	public void printCol(String col);
}

interface movie{
	public String getFavMovie();
	public void printMov(String Mov);
}

public class abstraction extends mother implements colour,movie{

	@Override
	public void printNM() {
		printNM();
		System.out.println("I am child");
	}

	public static void main(String[] args) {
		abstraction obj = new abstraction();
		obj.printNM();
		
	}

	@Override
	public String getFavCol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printCol(String col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFavMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMov(String Mov) {
		// TODO Auto-generated method stub
		
	}

}

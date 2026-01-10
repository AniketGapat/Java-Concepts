package string;

public class stringBufferAndBuilder {

	static StringBuffer sBuff = new StringBuffer("Hello");
	static StringBuilder sBuil = new StringBuilder("Hey!");
	
	public static void main(String[] args) {
		sBuff.append("Java");
		System.out.println(sBuff);
		sBuil.append("World");
		System.out.println(sBuil);
	}

}

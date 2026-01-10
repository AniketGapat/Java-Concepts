package dataTypes;

public class primitiveDataTypes {
	
	public static void integerDataTypes() {
		byte bNo = 123;//can store 3 digit -128 to 127
		short sNo = 12345;//can store 5 digit -32768 to 32767
		int iNo = 1234567890;//can store 10 digit -2147483648 to 2147483647
		long lNo = 1234567890123456789l;//can store 19 digit -9223372036854775808 to 9223372036854775807

		System.out.println("Byte no : "+bNo);
		System.out.println("Short no : "+sNo);
		System.out.println("Integer no : "+iNo);
		System.out.println("Long no : "+lNo);
	}
	
	public static void floatDataTypes() {
		float fNo = 1.12345678f;//can have 7 digit after decimal point
		double dNo = 1.123456789012345d;//can have 15 digit after decimal point
		System.out.println("");
		System.out.println("Float no : "+fNo);
		System.out.println("Double no : "+dNo);
	}
	
	public static void otherDataTypes() {
		boolean bVal = true;//can have values True or False
		char ch = 'a';//have to declare inside single quotes ' ' and we can define only single alphabet
		char no = 109;//ASCII value of alphabet 'm'
		System.out.println("");
		System.out.println("Boolean value : "+(bVal=false));
		System.out.println("Char Value : "+ch);
		System.out.println("Char Value of ASCII : "+no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		integerDataTypes();
		floatDataTypes();
		otherDataTypes();
	}

}

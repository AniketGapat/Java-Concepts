package string;

public class strOp {
	
	static String str = "Hello"; //creating string by java string literal
	static String strN = "Hello";
	//str = "world"; //not possible
	static String str1 = new String("Hello"); //creating string by new keyword
	//str = ""; //not possible
	static String str12 = new String("Hello");
	
	
	public static void strOp() {
		char[] ch = {'a','b','c'};
		
		String chStr = new String(ch); //converting ch to string
		System.out.println(chStr);
		chStr.toCharArray();
		System.out.println(chStr);
		System.out.println();
		
		System.out.println("comparing string by '=':"+(str==strN));
		System.out.println("comparing string by 'equals':"+str.equals(strN)); 
		System.out.println("comparing string by 'equalsIgnoreCase':"+str.equalsIgnoreCase(strN)); 
		
		System.out.println("comparing string with string objects by '=':"+(str==str1)); //can not compare objects with '=='
		System.out.println("comparing string with string objects by 'equls':"+(str.equals(str12)));
		System.out.println("comparing string objects by '=':"+(str12==str1));
		System.out.println("comparing string objects by 'equals':"+str12.equals(str1)); //use to compare string objects
		
		System.out.println("Length of string : "+strN.length());
		System.out.println("Length of string : "+str12.length());
		System.out.println("Character at 0 : "+strN.charAt(0));
		System.out.println("Substring : "+strN.substring(0, 4));
		System.out.println("Sub Sequence : "+strN.subSequence(0, 4));
		System.out.println("check contains 'Hell' :"+strN.contains("Hell"));
		
		String nstr = " ";
		System.out.println("String ' ' is Blank? "+nstr.isBlank());
		System.out.println("String ' ' is empty? "+nstr.isEmpty());
		
		String nstrObj = new String(" ");
		System.out.println("String object ' ' is Blank? "+nstrObj.isBlank());
		System.out.println("String object ' ' is Empty? "+nstrObj.isEmpty());
		
		String str = " hi world this  is monali!";
		System.out.println("String contains 'hi' or not: "+str.contains("hi"));
		System.out.println("Trim string :"+str.trim()); //removed space from beginning and end
		System.out.println(str.compareTo(nstr));//not much useful
		System.out.println(str.concat(chStr));//concat strings
		String str1; 
		str1 = str.replace("hi ", "hello "); //replace characters
		System.out.println(str1);
		str1 = str.replace(str, str1); //replace strings
		System.out.println(str1);
		//str1 = str.replaceFirst("\\s", str);//replace first regex expression with str
		str1 = str.replaceAll("[.,!\\s]+", " ");
		System.out.println("String after replacing spance and characters : "+str1);
		str1 = str.trim();
		String stri[] = str1.split("[\\s.,!]+");
		System.out.println("String array : ");
		for(int i=0;i<stri.length;i++) {
			System.out.println("i element : "+stri[i]);
		}
		
		
		//integer array to string array
		int arr[]= {12,34,56,768,89};
		String strArr[] = new String[arr.length];
		System.out.println("String array : ");
		for(int i = 0; i<arr.length; i++) {
			int no = arr[i];
			strArr[i]=String.valueOf(no);
			System.out.println(strArr[i]);
		}
		
		//String to integer array
		int[] intArray = new int[strArr.length];
		System.out.println("Integer array : ");
		for(int j =0 ;j<strArr.length; j++) {
			int value = Integer.parseInt(strArr[j]);
			intArray[j]=value;
			System.out.println(intArray[j]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strOp();
	}

}

package dataTypes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//non-primitive data types are class,object,interface,array and string

interface arithmeticOp{    //another example of non primitive data type
	void sum(int a, int b);
	void sub(int a, int b);
}

public class nonPrimitiveDataTypes implements arithmeticOp{

	public static void stringOp() {
		String str = 12.12+12+" 12 months 1 year "+12+13, 
				str1 = ""+(15+15)+"",
				str2 = ""+15+15+"";

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void arrayOp() {
		int arr[]= {1,2,15,200,10};

		System.out.println(arr.length);
		System.out.println("Last element of array: "+(arr.length-1));//prints last element of array
		System.out.println("Random value from array: "+arr[new Random().nextInt(arr.length)]);//random array value
		
		String strArr [] = new String[3];
		Scanner sc = new Scanner(System. in ); 
		
		//accepting value from console in String array
		for(int i = 0; i<strArr.length; i++) {
			System.out.println("Enter value : ");
			strArr[i] = sc.next();
		}
		//printing values of array
		System.out.println("Stored values of string array are : ");
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	
	@Override
	public void sum(int a, int b) {
		int result;
		result = a + b;
		System.out.println("Addition of numbers : "+result);
	}

	public static void main(String[] args) {
		stringOp(); //string is non primitive data type
		arrayOp(); //array is non primitive data type
		nonPrimitiveDataTypes obj = new nonPrimitiveDataTypes(); // obj here is non primitive data type
		obj.sum(25,100);
		obj.sub(200, 100);
	}

	@Override
	public void sub(int a, int b) {
		int result;
		result = a - b;
		System.out.println("Substraction of numbers : "+result);
	}
}

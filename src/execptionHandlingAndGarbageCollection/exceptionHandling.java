package execptionHandlingAndGarbageCollection;
//import java.lang.ArrayIndexOutOfBoundsException;

import java.io.IOException;

public class exceptionHandling {
	
	 public void finalize(){System.out.println("object is garbage collected");}  

	public static String demo() throws IOException{
		String exception = "error";
String str = "hello";
		try {
			int arr[] = { 12, 34, 45, 46, 12 };
			for (int i = 0; i <= arr.length; i++)
				System.out.println(arr[i]);
		return str;
		} // catch(ArrayIndexOutOfBoundsException e) {

		catch (Exception e) {
			System.out.println("Array out of bound");
		}
		//throw new IllegalArgumentException("Forced exception");
		
		finally {
			System.out.println("finally");
		}
		return str;

	}
	
	public void ex() {
		try {
			
		}finally {
			
		}
	}

	public static void main(String[] args) throws IOException {
		demo();
		exceptionHandling obj = new exceptionHandling();
		obj = null;
		exceptionHandling objject = new exceptionHandling();
		objject = null;
		System.gc();
	}
}

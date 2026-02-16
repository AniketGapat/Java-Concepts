package arrayOperations;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Aniket", "John", "Sagar", "Lokesh", "Zara", "Bob", "Shubham" };
		System.out.println("Original names array:");

		// Print array with for each loop
		for (String name : names) {
			System.out.print(name + "\t");
		}
		System.out.println();

		System.out.println("Sorted names array:");
		Arrays.sort(names);
		// Print array without for loop
		System.out.println(Arrays.toString(names));
		
		System.out.println("Sorted names array in reverse order:");
		// Print sorted array wit reverse order using for loop
		for (int i = names.length-1; i >= 0; i--) {
			System.out.print(names[i] + "\t");
		}

	}

}

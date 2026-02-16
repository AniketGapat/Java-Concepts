package arrayOperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 2, 7, 4, 7, 2, 8, 9, 3, 1 };
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		// Sort array with build-in method
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		// Remove duplicates from array
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		
		// Converting set back to array
		Integer[] result = set.toArray(new Integer[set.size()]);
		
		// Print sorted array without duplicates
		System.out.println("Sorted array withoit duplicates: " + Arrays.toString(result));
	}

}

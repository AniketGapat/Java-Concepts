package arrayOperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 7, 4, 7, 2, 8, 9, 3, 1 };

		System.out.println("Original Array: " + Arrays.toString(arr));

//		// Sort array with build-in method
//		Arrays.sort(arr);
//		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(set.contains(num)) {
				System.out.println("Duplicated number in array is: " + num);
			} else {
				set.add(num);
			}
		}
	}

}

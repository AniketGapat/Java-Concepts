package arrayOperations;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 10, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80 };

		findCommon(arr1, arr2);

		findCommon(arr1, arr2, arr3);

	}

	public static void findCommon(int[]... arrays) {
        // Added var argument which work for any number of array
		
		Set<Integer> result = new HashSet<>();

		// Add first array elements into set
		for (int num : arrays[0]) {
			result.add(num);
		}

		// Compare with remaining arrays
		for (int i = 1; i < arrays.length; i++) {

			Set<Integer> temp = new HashSet<>();

			for (int num : arrays[i]) {
				if (result.contains(num))
					temp.add(num);
			}

			result = temp; // update result
		}

		// Print common elements
		System.out.println("Common Elements are: " + result);
//		for (int num : result)
//			System.out.print(num + "\t");
	}

}

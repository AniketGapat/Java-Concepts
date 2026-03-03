   package arrayOperations;

import java.util.Arrays;

public class ArrayEqualityCheck {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 6, 5, 3, 4, 1, 2 };
		int[] arr3 = { 1, 3, 4, 5, 6 };
		
		boolean areEqual = Arrays.equals(arr1, arr2);
		System.out.println("Arrays  arr1  and arr2  are equal: " + areEqual);
		// In array if position is different in both array then it will not be equal so sorting of array needed
		
		Arrays.sort(arr2);
		boolean areEqual1 = Arrays.equals(arr1, arr2);
		System.out.println("Arrays  arr1  and arr2  are equal after sorting: " + areEqual1);

		equalityCheck(arr1, arr2, arr3);
		equalityCheck(arr1, arr2);
		equalityCheck(arr1, arr3);
		equalityCheck(arr2, arr3);
	}

	public static void equalityCheck(int[]... arrays) {
		if (arrays.length < 2) {
			System.out.println("Need at least 2 arrays");
			return;
		}

		for (int i = 1; i < arrays.length; i++) {
			Arrays.sort(arrays[i]);
			
			if(!Arrays.equals(arrays[0], arrays[i])) {
				System.out.println("Arrays are not equal");
				return;
			}
		}
		 System.out.println("Arrays are equal");
	}

}

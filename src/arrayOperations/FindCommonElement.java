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

		findCommonUsingTwoPointer(arr1, arr2);
		
		findCommonUsingThreePointer(arr1, arr2, arr3);

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

	public static void findCommonUsingTwoPointer(int[] arr1, int[] arr2) {
		System.out.println("Common Elements using Two PointerTechnique");
		int i = 0, j = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			} else if(arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
	}
	
	public static void findCommonUsingThreePointer(int[] arr1, int[] arr2, int[] arr3) {
		System.out.println("Common Elements using Three PointerTechnique");
		int i = 0, j = 0, k = 0;
		while(i < arr1.length && j < arr2.length && k < arr3.length) {
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			} else if(arr1[i] < arr2[j]) {
				i++;
			} else if(arr2[j] < arr3[k]){
				j++;
			} else {
				k++;
			}
		}
	}
}

package arrayOperations;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 10, 11 };
		int[] arr2 = { 2, 4, 6, 8, 9 };

		int[] mergedArray = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		System.out.println("Merged Sorted Array is: " + Arrays.toString(mergedArray));
	}

}

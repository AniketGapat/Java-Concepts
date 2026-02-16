package arrayOperations;

import java.util.Arrays;

public class BubbleSortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 2, 9, 1, 5, 6, 8, 7 };

//		// Built-in method
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		// Bubble sort with for loop
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
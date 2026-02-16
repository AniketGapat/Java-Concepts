package arrayOperations;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 333, 667, 879 };
		int reverseArray[] = new int[arr.length];
		int arrSize = 0;

		// Print array in reverse order using for loop and another array
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseArray[arrSize] = arr[i];
			arrSize++;
		}
		
		System.out.println("Reversed array is :");
		for (int i : reverseArray) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// Print array in reverse array using two pointer or within that same array
		int[] arr1 = { 10, 50, 20, 80, 90, 70, 30};
		System.out.println("Original Array: "+ Arrays.toString(arr1));
		
		//Sort array in ascending order
		Arrays.sort(arr1);
		System.out.println("Sorted Array: "+ Arrays.toString(arr1));
		
		int right = arr1.length - 1;
		int left = 0;
		while (right > left) {
			int temp = arr1[right];
			arr1[right] = arr1[left];
			arr1[left] = temp;
			left++;
			right--;
		}	
		System.out.println("Reverse Array: "+ Arrays.toString(arr1));
	}

}

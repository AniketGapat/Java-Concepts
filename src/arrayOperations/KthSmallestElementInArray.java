package arrayOperations;

import java.util.Arrays;

public class KthSmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 7, 10, 4, 3, 20, 15, 2, 8, 16 };
		int k = 3;
		System.out.println("original Array: " + Arrays.toString(array));
        
		// Second Smallest
		kthSmallest(array, 2);
		
		// Second largest
		kthLargest(array, 2);
	}

	public static void kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		System.out.println(k + "th smallest element from the sorted array is: " + arr[k - 1]);
	}

	public static void kthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		int right = arr.length - 1;
		int left = 0;
		while (right > left) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}

		System.out.println(k + "th largest element from the sorted array is: " + arr[k - 1]);
	}

}

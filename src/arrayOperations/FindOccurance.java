package arrayOperations;

import java.util.Arrays;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1 };
		Arrays.sort(arr); //{1,1,2,2,3,3,4,5}
		int target = 3;

		int result = findLastOccurance(arr, target);
		if (result != -1) {
			System.out.println("Last ocurrance of target is at index: " + result);
		} else {
			System.out.println("Element not found in array");
		}

	}

	public static int findLastOccurance(int[] arr, int target) {
		// initiate two pointers at 0 and arr.length-1
		int low = 0;
		int high = arr.length - 1;
		int result = -1;

		// Start the binary search loop
		while (low <= high) {
			// calculate middle index
			int mid = low + (high - low) / 2;

			// check if the element in middle is the target
			if (arr[mid] == target) {
				result = mid; // if found store the index
				low = mid + 1; // to find last occurance continue in right half to search
			}

			// if target is smaller than arr[mid], search in left half
			else if (arr[mid] > target) {
				high = mid - 1;
			}

			// if the target is larger than arr[mid], search the
			else {
				low = mid + 1;
			}
		}

		return result;
	}

}

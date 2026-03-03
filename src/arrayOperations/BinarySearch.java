package arrayOperations;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] targets = { 5, 9, 15, 21 };
		
		for( int target : targets) {
			int result = binarySearch(array, target);
			
			if(result!= -1) {
				System.out.println("Element '" + target + "' found in array at index: " + result);
			}else {
				System.out.println("Element not found in the array");
			}
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int middle = left + (right - left) / 2;

			if (arr[middle] == target) {
				return middle;
			}
			// if target is smaller ignore right half and if larger then ignore the left
			// half
			else if (arr[middle] > target) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}

}

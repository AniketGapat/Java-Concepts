package arrayOperations;

public class ArrayRotation {

	public static void main(String[] args) {
		/*
		 * 1, 2, 3, 4, 5, 6, 7 --> If somebody same rotate this array by 3 steps to the
		 * right that means --> 5, 6, 7, 1, 2, 3, 4
		 */

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		rotateArray(array, 3);
		printArray(array);
		System.out.println();
		
		rotateArray(array, 4);
		printArray(array);

	}

	public static void rotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		k = k % n;
		
		reverse(arr, 0, n - 1);   // Step 1 -> reverse entire array -> 7, 6, 5, 4, 3, 2, 1
        reverse(arr, 0, k - 1);   // Step 2 -> reverse first k elements -> 5, 6, 7, 4, 3, 2, 1
        reverse(arr, k, n - 1);   // Step 3 -> reverse remaining elements -> 5, 6, 7, 1, 2, 3, 4
	}

	public static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + "\t");
		}
	}

}

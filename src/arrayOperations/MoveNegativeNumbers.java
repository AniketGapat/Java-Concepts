package arrayOperations;

import java.util.Arrays;

public class MoveNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, -2, 5, -1, -9, 10, 12, -4 };
		System.out.println("original Array is: " + Arrays.toString(arr));

		rearrange(arr);
		System.out.println("Modified Array is: " + Arrays.toString(arr));
	}

	public static void rearrange(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			while (left < arr.length && arr[left] < 0) {
				left++;
			}
			while (right >= 0 && arr[right] > 0) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
	}

}

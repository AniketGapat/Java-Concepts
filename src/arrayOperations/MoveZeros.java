package arrayOperations;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 0, 3, 0, 4, 1, 0, 3, 0 };

		// Move zeros to end
		moveTargetToEnd(array, 0);

		// Move ones to end
		moveTargetToEnd(array, 1);
	}

	public static void moveTargetToEnd(int[] arr, int target) {
		int index = 0;

//		// Method 1: Adding zeros at the end for remaining index using while loop
//		// Added temporary array so it won;t modify the main array and same array will
//		// use for multiple operation without change.
//		int[] temp = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != target) {
//				temp[index++] = arr[i];
//			}
//		}
//
//		while (index < arr.length) {
//			temp[index++] = target;
//		}
//		System.out.println(Arrays.toString(temp));

		// Method 2: Use 2 pointer and swap the elements
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != target) {
				int num = arr[index];
				arr[index] = arr[i];
				arr[i] = num;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

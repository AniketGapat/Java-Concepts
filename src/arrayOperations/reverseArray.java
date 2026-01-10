package arrayOperations;

public class reverseArray {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 667, 879 };
		int reverseArray[] = new int[arr.length];
		int no;
		int arrSize = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			no = arr[i];
			reverseArray[arrSize] = no;
			arrSize++;
		}
		System.out.println("Reversed array is :");
		for (int i : reverseArray) {
			System.out.print(" "+i);
		}

	}

}

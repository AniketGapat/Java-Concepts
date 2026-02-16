package arrayOperations;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 30, 50, 20, 60, 90, 70, 40, 80 };
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}
		
		System.out.println("Sum of numbers in array is: " + sum);
	}

}

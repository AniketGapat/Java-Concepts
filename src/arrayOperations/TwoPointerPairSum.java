package arrayOperations;

/*
aray = {1,2,4,7,11,15};
target = 15;
pair checked (1+15) (1+11) (4+11)
pair found (4+11) = 15
*/

public class TwoPointerPairSum {

	public static void hasPairWithSum(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		boolean found = false;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum == target) {
				System.out.println("Pair found: (" + arr[left] + "," + arr[right] + ")");
				found = true;
				left++;
				right--;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		if (!found) {
			System.out.println("No pair found for targeted sum.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 4, 7, 11, 13, 15 };
		int target = 15;

		hasPairWithSum(array, target);

	}

}

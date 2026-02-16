package arrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8, 9 };

		missingNumber(arr);
		
		int[] arr1 = { 1, 2, 3, 4, 5 };

		missingNumber(arr1);

	}

	public static void missingNumber(int[] arr) {
		Arrays.sort(arr);

		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}

		int first = arr[0];
		int last = arr[arr.length - 1];
		boolean found = false;
		ArrayList<Integer> missingNumbers = new ArrayList<>();
//	    System.out.println("Missing Numbers are: ");
	    
		for (int i = first; i < last; i++) {
			if (!set.contains(i)) {
//				System.out.print(i + " ");
				missingNumbers.add(i);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No missing number found");
		}else {
			System.out.println("Missing Numbers are: " + missingNumbers);
		}
		
	}

}

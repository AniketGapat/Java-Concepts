package arrayOperations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 2, 4, 2, 4, 5, 2, 4 };
		findMajorityUsingMap(arr);
		
	}

	public static void findMajorityUsingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int max = Collections.max(map.values());
		
		for (Map.Entry entry : map.entrySet()) {
			if(entry.getValue().equals(max)) {
				System.out.println("Majority element in the array is '" + entry.getKey() + "' with '" + max +"' times");
			}
		}
	}

}

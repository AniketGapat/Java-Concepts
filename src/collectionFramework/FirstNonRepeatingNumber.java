package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 4, 5, 1, 2, 0, 4 };
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int num : numbers) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First non-repeating number is: " + entry.getKey());
				break;
			}
		}
	}

}

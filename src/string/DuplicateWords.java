package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		String input = "Java is a programming language. java is also a platform.";
		
		findDuplicateWords(input);
	}

	public static void findDuplicateWords(String str) {
		str = str.toLowerCase();

		String[] words = str.split("\\W+");

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			if (!word.isEmpty()) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate word: " + entry.getKey() + " -> appears " + entry.getValue() + " times");
			}
		}
	}

}

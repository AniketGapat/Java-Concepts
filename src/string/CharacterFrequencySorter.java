package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterFrequencySorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = " Automation testing";
		char[] chars = word.toLowerCase().toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : chars) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

		// print unique characters
		System.out.println("Unique characters are: ");
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		
		System.out.println();
		System.out.println("printing frequency in descending ordere");

		// Convert Map into List for sorting
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

		// Sort list in descending order based on frequency
		// Result = 5 - 2 = positive → swap → higher first
		list.sort((a, b) -> b.getValue() - a.getValue());

		for (Entry<Character, Integer> entry : list) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}

}

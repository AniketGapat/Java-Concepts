package string;

import java.util.HashMap;
import java.util.Map;

public class VowelCount {

	public static void main(String[] args) {
		String str = "Hello! I am Aniket. And I believe in MultiUniverse";
		str = str.toLowerCase();

		countVowels(str);

		countEachVowel(str);
		
		countEachVowelWithMap(str);

	}

	public static void countVowels(String str) {
		int count = 0;
		for (int k = 0; k < str.length(); k++) {

			char ch = str.charAt(k);
			if ("aeiouAEIOU".indexOf(ch) != -1) {
				count++;
			}
		}
		System.out.println("Number of vowels present in the string is: " + count);
	}

	public static void countEachVowel(String str) {
		int aCnt = 0, eCnt = 0, iCnt = 0, oCnt = 0, uCnt = 0;

		for (int k = 0; k < str.length(); k++) {
			switch (str.charAt(k)) {
			case 'a':
				aCnt++;
				break;
			case 'e':
				eCnt++;
				break;
			case 'i':
				iCnt++;
				break;
			case 'o':
				oCnt++;
				break;
			case 'u':
				uCnt++;
				break;
			}
		}
		System.out.println("'a' count : " + aCnt);
		System.out.println("'e' count : " + eCnt);
		System.out.println("'i' count : " + iCnt);
		System.out.println("'o' count : " + oCnt);
		System.out.println("'u' count : " + uCnt);
	}

	public static void countEachVowelWithMap(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		
		for (char c : chars) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " count is: " + entry.getValue());
		}
	}

}

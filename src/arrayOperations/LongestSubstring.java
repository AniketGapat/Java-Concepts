package arrayOperations;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(input));
		System.out.println(longestSubstring(input));

		String[] testCases = { "abcabcbb", "bbbbb", "pwwkew", "abcdefg", "" };

		for (String s : testCases) {
			if (s.isEmpty()) {
				System.out.println("Input: \"\" → Length: 0, Substring: \"\"");
			} else {
				int len = lengthOfLongestSubstring(s);
				String sub = longestSubstring(s);
				System.out.println("Input: \"" + s + "\" → Length: " + len + ", Substring: \"" + sub + "\"");
			}
		}
	}

	public static int lengthOfLongestSubstring(String input) {

		HashMap<Character, Integer> map = new HashMap<>();
		int maxlength = 0;
		int left = 0;

		for (int right = 0; right < input.length(); right++) {
			char ch = input.charAt(right);

			if (map.containsKey(ch)) {
				left = map.get(ch) + 1;
			}

			map.put(ch, right);

			maxlength = Math.max(maxlength, right - left + 1);
		}

		return maxlength;
	}

	public static String longestSubstring(String input) {
		HashMap<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		int left = 0;
		int start = 0;

		for (int right = 0; right < input.length(); right++) {
			char ch = input.charAt(right);

			if (map.containsKey(ch)) {
				left = Math.max(left, map.get(ch) + 1);
			}

			map.put(ch, right);

			if (right - left + 1 > maxLength) {
				maxLength = right - left + 1;
				start = left;
			}
		}

		return input.substring(start, start + maxLength);
	}

}

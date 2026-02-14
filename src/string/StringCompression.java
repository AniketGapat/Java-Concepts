package string;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aaabbbcccccddefff";

		System.out.println("Original String is " + str);
		System.out.println("Compressed String is " + compressString(str));
	}

	public static String compressString(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		StringBuilder compressed = new StringBuilder();
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				compressed.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Append the last character and it's count
		compressed.append(str.charAt(str.length() - 1)).append(count);
		return compressed.length() < str.length() ? compressed.toString() : str;
	}

}

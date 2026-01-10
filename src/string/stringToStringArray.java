package string;

public class stringToStringArray {

	public static void main(String[] args) {
		String str = "Hey! It was nice to meet you. Let's catch up again?";
		
		str = str.replaceAll("[^'a-zA-Z ]", "");
		
		String strArr[] = str.split(" ");
		
		for(int i = 0;i < strArr.length;i++) {
			System.out.println(strArr[i]);
		}
	}

}

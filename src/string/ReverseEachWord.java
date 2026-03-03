package string;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Aniket will start learn python";
		 System.out.println("original String is: " + input);
		 String[] words = input.split(" ");
		 
		 StringBuilder result = new StringBuilder();
		 
		 for(String word : words) {
//			 result.append(new StringBuilder(word).reverse().toString()).append(" ");
			 result.append(reverse(word)).append(" ");
		 }
		 
		 System.out.println("reversed word string is: " + result);
		 
		 System.out.println("reversed string is: " + reverse(input));

	}
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

}

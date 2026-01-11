package BasicPrograms;

public class Palindrome {
	 static void isPalindrome(int n) {
		 int r, sum =0, temp;
			temp = n;
			while(n>0) {
				r = n%10; // getting reminder
				sum = sum*10 + r;
				n = n/10; // getting quotient
			}
			
			if(temp == sum) {
				System.out.println(temp+ " is Palindrome Number");
			} else {
				System.out.println(temp+ " is not Palindrome Number");
			}
	 }
	 
	 static void checkPalindrome(String string){
		 String normalised = string.toLowerCase();
		 String reversed = new StringBuilder(normalised).reverse().toString();
		 if(normalised.equals(reversed)) {
			 System.out.println(string+ " is Palindrome Number");
			} else {
				System.out.println(string+ " is not Palindrome Number");
			}
		 
	 }
	 
	public static void main(String[] args) {
		// A Palindrome is a word, phrase, number, or sequence that reads the same backward as forward, ignoring spaces, punctuation, and capitalization in some cases.
		
		isPalindrome(12321);
		isPalindrome(12345);
		
		checkPalindrome("ana");
		checkPalindrome("Ana");
		checkPalindrome("1234");
		checkPalindrome("454");
	}
}
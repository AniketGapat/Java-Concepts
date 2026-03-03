package arrayOperations;

public class AllSubStrings {
	//Substring is sequence of characters that appear in the string in same order.
	//For ex. - abc -. a, b, c, ab, bc, abc
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		findSubString(input);
		
		findSubString("Hello");
		
		String ip = null;
		findSubString(ip);
	}
	
	public static void findSubString(String input) {
		try {
			int count = 0;
			for(int i=0; i< input.length(); i++){
				for(int j=i+1; j<= input.length(); j++) {
					System.out.println(input.substring(i,j));
					count++;
				}
			}
			System.out.println("Number of substring in the string '" + input + "' are: " + count);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

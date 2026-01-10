package dataTypes;

public class reverseNumber {

	public static void main(String[] args) {
		int num = 356456878;
		int revNum = 0;
		
		while(num>0) {
			revNum = revNum * 10+ num%10;
			num = num/10;
		}
		System.out.println(revNum); 
	}

}

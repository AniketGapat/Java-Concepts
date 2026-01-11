package BasicPrograms;

public class NumberToWord {

	static String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	static String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	public static String convert(int num) {

		if (num == 0)
			return "Zero";

		String result = "";

		if (num >= 100000) {
			result += convert(num / 100000) + " Lacs ";
			num %= 100000;
		}

		if (num >= 1000) {
			result += convert(num / 1000) + " Thousand ";
			num %= 1000;
		}

		if (num >= 100) {
			result += ones[num / 100] + " Hundred ";
			num %= 100;
		}

		if (num >= 10 && num <= 19) {
			result += teens[num - 10];
		} else {
			result += tens[num / 10];
			result += " " + ones[num % 10];
		}

		return result.trim();
	}

	public static void main(String[] args) {
		System.out.println(convert(0));
		System.out.println(convert(14));
		System.out.println(convert(65));
		System.out.println(convert(347));
		System.out.println(convert(9876));
		System.out.println(convert(99876));
		System.out.println(convert(199876));
		System.out.println(convert(8499876));

		int num = 145;
		int temp, sum = 0, digit;
		temp = num;
		while (temp > 0) {
			digit = temp % 10;
			int fact=1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
				System.out.println(fact);
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		
		if(sum == num) {
			System.out.println(num + " is Peterson Number");
		} else {
			System.out.println(num+ " is not Peterson number");
		}
	}

}

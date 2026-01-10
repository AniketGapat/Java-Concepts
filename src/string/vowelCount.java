package string;

public class vowelCount {

	public static void main(String[] args)  {
		String str = "Hello! I am monali. And I believe in MultiUniverse";
		str = str.toLowerCase();

		char ch;
		int aCnt = 0, eCnt = 0, iCnt = 0, oCnt = 0, uCnt = 0;

		for (int k = 1; k < str.length(); k++) {
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

}

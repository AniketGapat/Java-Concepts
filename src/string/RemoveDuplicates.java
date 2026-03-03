package string;

public class RemoveDuplicates {
	
    // ─────────────────────────────────────────
    // Method 1: Using LinkedHashSet (preserves order)
    // ─────────────────────────────────────────
    public static String usingLinkedHashSet(String s) {
        StringBuilder result = new StringBuilder();
        java.util.LinkedHashSet<Character> set = new java.util.LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (set.add(c)) {         // add() returns false if duplicate
                result.append(c);
            }
        }
        return result.toString();
    }

    // ─────────────────────────────────────────
    // Method 2: Using Boolean Array (fastest)
    // ─────────────────────────────────────────
    public static String usingBooleanArray(String s) {
        boolean[] seen = new boolean[256]; // ASCII characters
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testCases = {"programming", "aabbccdd", "hello world", "abcabc", "java"};

        System.out.printf("%-20s %-20s %-20s%n",
                "Input", "LinkedHashSet", "BooleanArray");
        System.out.println("─".repeat(60));

        for (String s : testCases) {
            System.out.printf("%-20s %-20s %-20s%n",
                    s,
                    usingLinkedHashSet(s),
                    usingBooleanArray(s));
        }
    }

}

/*🔎 Meaning of %-20s

%s → string

20 → width of column

- → left aligned

%n → new line (platform independent)

So this prints 3 columns of width occurred 20 characters each.*/

//OUTPUT
//
//Input                LinkedHashSet        BooleanArray        
//────────────────────────────────────────────────────────────
//programming          progamin             progamin            
//aabbccdd             abcd                 abcd                
//hello world          helo wrd             helo wrd            
//abcabc               abc                  abc                 
//java                 jav                  jav  

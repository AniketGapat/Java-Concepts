package BasicPrograms;

public class NumberPatternPrint {

	public static void main(String[] args) {
		int i, j, n = 7;

		// 1. Right Triangle Number pattern
		System.out.println("Right Triangle Number pattern");
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 2. Right Triangle Increase Number pattern
		System.out.println("Right Triangle Increase Number pattern");
		int number = 1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
		System.out.println(number);

		// 3. Pyramid Number Pattern
		System.out.println("Pyramid Number pattern");
		for (i = 1; i <= n; i++) {
			for (j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 4. Diamond Number Pattern
		System.out.println("Diamond Number pattern");
		for (i = 1; i <= n; i++) {
			for (j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (i = n - 1; i >= 1; i--) {
			for (j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 5. Right Pascal Triangle Same Number pattern
		System.out.println("Right Pascal Triangle Same Number pattern");
		for (i = 1; i < n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// 6. Right Triangle Same Number pattern
		System.out.println("Right Triangle Same Number pattern");
		for (i = n; i >= 1; i--) {
			for (j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 7. Right Triangle descending Number pattern
		System.out.println("Right Triangle descending Number pattern");
		for (i = 1; i <= n; i++) {
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 8. Square Number pattern
		System.out.println("Square Number pattern");
		for(i=1; i<=n; i++) {
			for(j=i; j<=n; j++) {
				System.out.print(j+" ");
			}
			for(int k=1; k<i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}

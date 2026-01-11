package BasicPrograms;

public class StarPatternPrint {

	public static void main(String[] args) {
		// 1. Right triangle STAR pattern program
		int i, j, row = 6;
		System.out.println("Right triangle STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 2. Left triangle STAR pattern program
		System.out.println("Left triangle STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 3. Pyramid STAR pattern program
		System.out.println("Pyramid STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 4. Inverted Pyramid STAR pattern program
		System.out.println("Inverted Pyramid STAR pattern program");
		for (i = row; i > 0; i--) {
			for (j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 5. Diamond STAR pattern program
		System.out.println("Diamond STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = row - 1; i > 0; i--) {
			for (j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 6. Downward triangle STAR pattern program
		System.out.println("Downward triangle STAR pattern program");
		for (i = row; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 7. Mirrored Right STAR pattern program
		System.out.println("Mirrored Right STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 8. Right Down Mirror STAR pattern program
		System.out.println("Right Down Mirror STAR pattern program");
		for (i = row; i > 0; i--) {
			for (j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 9. Right Pascal STAR pattern program
		System.out.println("Right Pascal STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = row; i > 0; i--) {
			for (j = 0; j < i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 10. Left Pascal STAR pattern program
		System.out.println("Left Pascal STAR pattern program");
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = row; i > 0; i--) {
			for (j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// without space between stars
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = row; i > 0; i--) {
			for (j = row - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 11. Sandglass STAR pattern program
		System.out.println("Sandglass STAR pattern program");
		for (i = row; i > 0; i--) {
			for (j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 1; i < row; i++) {
			for (j = 1; j < row - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 12. Hollow Triangle STAR pattern
		System.out.println("Hollow Triangle STAR pattern program");
		for (i = 1; i <= row; i++) {
			for (j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i - 1); j++) {
				if (j == 0 || i == row || j == (2 * i - 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// 13. Hollow Down Triangle STAR pattern
		System.out.println("Hollow Down Triangle STAR pattern program");
		for (i = row; i >= 1; i--) {
			for (j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i - 1); j++) {
				if (j == 0 || i == row || j == (2 * i - 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 14. Hollow Diamond STAR pattern
				System.out.println("Hollow Diamond STAR pattern program");
				for (i = 1; i <= row; i++) {
					for (j = i; j < row; j++) {
						System.out.print(" ");
					}
					for (j = 0; j < (2 * i - 1); j++) {
						if (j == 0 || j == (2 * i - 2)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				for (i = row; i >= 1; i--) {
					for (j = i; j < row; j++) {
						System.out.print(" ");
					}
					for (j = 0; j < (2 * i - 1); j++) {
						if (j == 0 || j == (2 * i - 2)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
	}
}
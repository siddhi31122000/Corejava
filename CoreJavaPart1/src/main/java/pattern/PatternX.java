package pattern;

public class PatternX {

	public static void main(String[] args) {
		
				int size = 5; // Change this to the desired size

				printXPattern(size);
			}

			public static void printXPattern(int size) {
				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= size; j++) {
						if (i == j || j == size - i + 1) {
							System.out.print("* ");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
		
	}
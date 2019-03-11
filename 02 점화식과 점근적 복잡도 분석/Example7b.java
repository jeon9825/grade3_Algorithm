import java.util.Scanner;

public class Example7b {
	static void print1(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = n - i - 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void print2(int n, int i, int j) {
		if (i < n) {
			if (j < n - i - 1) {
				System.out.print(" ");
				print2(n, i, ++j);
			} else if (j < n) {
				System.out.print("*");
				print2(n, i, ++j);
			} else {
				System.out.println();
				j = 0;
				print2(n, ++i, j);
			}
		} else
			return;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("행 수를 입력하시오: ");
			int n = scanner.nextInt();
			print1(n);
			System.out.println();
			print2(n, 0, 0);
		}
	}
}
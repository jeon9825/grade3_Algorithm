import java.util.Arrays;

public class selectionSort {
	static void swap(String[] s, int index1, int index2) {
		String temp = s[index1];
		s[index1] = s[index2];
		s[index2] = temp;
	}

	static int findMinIndex(String[] s, int i) {
		String min = s[i];
		int minIndex = i;
		for (int j = i + 1; j < s.length; j++) {
			if (min.compareTo(s[j]) > 0) {
				min = s[j];
				minIndex = j;
			}
		}
		return minIndex;
	}

	static void selectionSort(String[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			int j = findMinIndex(s, i);
			swap(s, i, j);
		}
	}

	public static void main(String[] args) {
		String[] s = { "AAA", "FFF", "CCC", "BBB", "TTT" };
		selectionSort(s);
		System.out.println(Arrays.toString(s));
	}
}

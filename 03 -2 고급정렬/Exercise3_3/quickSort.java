import java.util.Arrays;

public class quickSort {
	static void swap(String[] s, int index1, int index2) {
		String temp = s[index1];
		s[index1] = s[index2];
		s[index2] = temp;
	}

	static int partition(String[] s, int start, int end) {
		int i = start - 1;
		String value = s[end];
		for (int j = start; j < end; j++) {
			if (s[j].compareTo(value) < 0)
				swap(s, ++i, j);
		}
		swap(s, ++i, end);
		return i;
	}

	static void quickSort(String[] s, int start, int end) {
		if (start >= end)
			return;
		int middle = partition(s, start, end);
		quickSort(s, start, middle - 1);
		quickSort(s, middle + 1, end);
	}

	public static void main(String[] args) {
		String[] s = { "AAA", "FFF", "CCC", "BBB", "TTT" };
		quickSort(s, 0, s.length - 1);
		System.out.println(Arrays.toString(s));
	}
}

import java.util.Arrays;

public class mergeSort {
	static void merge(String[] s, int start, int middle, int end) {
		int length = end - start + 1;
		String[] temp = new String[length];
		int i = 0;
		int index1 = start;
		int index2 = middle + 1;
		while (index1 <= middle && index2 <= end) {
			if (s[index1].compareTo(s[index2]) < 0)
				temp[i++] = s[index1++];
			else
				temp[i++] = s[index2++];
		}

		while (index1 <= middle)
			temp[i++] = s[index1++];
		while (index2 <= end)
			temp[i++] = s[index2++];

		for (int j = 0; j < temp.length; j++) {
			s[start + j] = temp[j];
		}
	}

	static void mergeSort(String[] s, int start, int end) {
		if (start == end)
			return;
		int middle = (start + end) / 2;
		mergeSort(s, start, middle);
		mergeSort(s, middle + 1, end);
		merge(s, start, middle, end);
	}

	public static void main(String[] args) {
		String[] s = { "AAA", "FFF", "CCC", "BBB", "TTT" };
		mergeSort(s, 0, s.length - 1);
		System.out.println(Arrays.toString(s));
	}

}

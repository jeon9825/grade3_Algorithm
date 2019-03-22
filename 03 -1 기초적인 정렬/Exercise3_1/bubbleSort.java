import java.util.Arrays;

public class bubbleSort {
	static void swap(String[] s, int index1, int index2) {
		String temp = s[index1];
		s[index1] = s[index2];
		s[index2] = temp;
	}

	static void bubbleSort(String[] s) {
		for (int i = s.length - 1; i > 0; i--) {
			boolean b = true;
			for (int j = 0; j < i; j++) {
				if (s[j].compareTo(s[j + 1]) > 0) {
					swap(s, j, j + 1);
					b = false;
				}
			}
			if (b)
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "AAA", "FFF", "CCC", "BBB", "TTT" };
		bubbleSort(s);
		System.out.println(Arrays.toString(s));
	}

}

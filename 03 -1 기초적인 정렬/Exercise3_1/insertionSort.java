import java.util.Arrays;

public class insertionSort {

	static void insertionSort(String[] s) {
		for (int i = 1; i < s.length; i++) {
			String value = s[i];
			for (int j = i - 1; j >= 0; j--) {
				if (value.compareTo(s[j]) < 0) {
					s[j + 1] = s[j];
					s[j] = value;
				} else {
					s[j + 1] = value;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] s = { "AAA", "FFF", "CCC", "BBB", "TTT" };
		insertionSort(s);
		System.out.println(Arrays.toString(s));
	}
}
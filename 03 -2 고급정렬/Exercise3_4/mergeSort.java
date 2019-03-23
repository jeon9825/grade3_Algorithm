import java.util.Arrays;
import java.util.Comparator;

public class mergeSort {

	static void merge(Person[] p, int start, int middle, int end, Comparator<Person> c) {
		int length = end - start + 1;
		Person[] temp = new Person[length];
		int i = 0;
		int index1 = start;
		int index2 = middle + 1;
		while (index1 <= middle && index2 <= end) {
			if (c.compare(p[index1], p[index2]) < 0)
				temp[i++] = p[index1++];
			else
				temp[i++] = p[index2++];
		}

		while (index1 <= middle)
			temp[i++] = p[index1++];
		while (index2 <= end)
			temp[i++] = p[index2++];

		for (int j = 0; j < temp.length; j++) {
			p[start + j] = temp[j];
		}
	}

	static void mergeSort(Person[] p, int start, int end, Comparator<Person> c) {
		if (start == end)
			return;
		int middle = (start + end) / 2;
		mergeSort(p, start, middle, c);
		mergeSort(p, middle + 1, end, c);
		merge(p, start, middle, end, c);
	}

	public static void main(String[] args) {
		Person[] p = { new Person("홍길동", 10), new Person("전지윤", 23), new Person("주수민", 25), new Person("전지윤", 25) };
		Comparator c = new PersonNameComparator();
		mergeSort(p, 0, p.length - 1, c);
		System.out.println(Arrays.toString(p));
	}

}

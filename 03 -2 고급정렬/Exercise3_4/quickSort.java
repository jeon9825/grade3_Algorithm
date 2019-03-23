import java.util.Arrays;
import java.util.Comparator;

public class quickSort {
	static void swap(Person[] p, int index1, int index2) {
		Person temp = p[index1];
		p[index1] = p[index2];
		p[index2] = temp;
	}

	static int partition(Person[] p, int start, int end, Comparator<Person> c) {
		int i = start - 1;
		Person value = p[end];
		for (int j = start; j < end; j++) {
			if (c.compare(p[j], value) < 0)
				swap(p, ++i, j);
		}
		swap(p, ++i, end);
		return i;
	}

	static void quickSort(Person[] p, int start, int end, Comparator<Person> c) {
		if (start >= end)
			return;
		int middle = partition(p, start, end, c);
		quickSort(p, start, middle - 1, c);
		quickSort(p, middle + 1, end, c);
	}

	public static void main(String[] args) {
		Person[] p = { new Person("홍길동", 10), new Person("전지윤", 23), new Person("주수민", 25), new Person("전지윤", 25) };
		Comparator c = new PersonNameComparator();
		quickSort(p, 0, p.length - 1, c);
		System.out.println(Arrays.toString(p));
	}
}

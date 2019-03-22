import java.util.Arrays;
import java.util.Comparator;

public class selectionSort {
	static void swap(Person[] p, int index1, int index2) {
		Person temp = p[index1];
		p[index1] = p[index2];
		p[index2] = temp;
	}

	static int findMinIndex(Person[] p, Comparator<Person> c, int index) {
		int minIndex = index;
		Person pMin = p[index];
		for (int i = index + 1; i < p.length; i++) {
			if (c.compare(pMin, p[i]) > 0) {
				pMin = p[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	static void selectionSort(Person[] p, Comparator<Person> c) {
		for (int i = 0; i < p.length - 1; i++) {
			int minIndex = findMinIndex(p, c, i);
			swap(p, i, minIndex);
		}
	}

	public static void main(String[] args) {
		Person[] p = { new Person("홍길동", 10), new Person("전지윤", 23), new Person("주수민", 25), new Person("전지윤", 25) };
		Comparator c = new PersonNameComparator();
		selectionSort(p, c);
		System.out.println(Arrays.toString(p));
	}
}

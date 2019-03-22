import java.util.Arrays;
import java.util.Comparator;

public class bubbleSort {
	static void swap(Person[] p, int index1, int index2) {
		Person temp = p[index1];
		p[index1] = p[index2];
		p[index2] = temp;
	}

	static void bubbleSort(Person[] p, Comparator<Person> c) {
		for (int i = p.length - 1; i > 0; i--) {
			boolean b = true;
			for (int j = 0; j < i; j++) {
				if (c.compare(p[j], p[j + 1]) > 0) {
					swap(p, j, j + 1);
					b = false;
				}
			}
			if (b)
				break;

		}
	}

	public static void main(String[] args) {
		Person[] p = { new Person("홍길동", 10), new Person("전지윤", 23), new Person("주수민", 25), new Person("전지윤", 25) };
		Comparator c = new PersonNameComparator();
		bubbleSort(p, c);
		System.out.println(Arrays.toString(p));
	}
}

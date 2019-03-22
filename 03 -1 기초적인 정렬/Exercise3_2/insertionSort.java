import java.util.Arrays;
import java.util.Comparator;

public class insertionSort {

	static void insertionSort(Person[] p, Comparator<Person> c) {
		for (int i = 1; i < p.length; i++) {
			Person value = p[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (c.compare(p[j], value) > 0) {
					p[j + 1] = p[j];
				} else {
					break;
				}
			}
			p[j + 1] = value;
		}
	}

	public static void main(String[] args) {
		Person[] p = { new Person("홍길동", 10), new Person("전지윤", 23), new Person("주수민", 25), new Person("전지윤", 25) };
		Comparator<Person> c = new PersonNameComparator();
		insertionSort(p, c);
		System.out.println(Arrays.toString(p));
	}
}

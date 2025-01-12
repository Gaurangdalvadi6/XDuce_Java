package collectionExample;
// 15/4/2024
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class LearnArraysClass {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 12, 36, 54, 69 };

		int search = Arrays.binarySearch(arr, 5);

		// System.out.println(search);

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Dev", 2));
		list.add(new Student("Parth", 1));
		list.add(new Student("Dipika", 4));
		list.add(new Student("Devanshu", 3));
		list.add(new Student("Sunny", 5));

		Student s1 = new Student("Dev", 2);
		Student s2 = new Student("Devanshu", 3);

		System.out.println(list);

		// Collections.sort(list);

		Collections.sort(list, (o1,o2)-> o1.name.compareTo(o2.name));

		System.out.println(list);

	}
}

package collectionExample;
// 15/4/2024
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<Student>();
		
		students.add(new Student("Parth", 1));
		students.add(new Student("Dev", 2));
		students.add(new Student("Devanshu", 3));
		students.add(new Student("Dipika", 4));
		students.add(new Student("Sunny", 4));
		
		
		System.out.println(students);
		
//		Set<Integer> set = new TreeSet<Integer>();
//		set.add(15);
//		set.add(8);
//		set.add(20);
//		set.add(4);
//		set.add(26);
//		set.add(8);
//		
//		System.out.println(set);
//		
//		set.remove(4);
//		System.out.println(set);
		
	}
}
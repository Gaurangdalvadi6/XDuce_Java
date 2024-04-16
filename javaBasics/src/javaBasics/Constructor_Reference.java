package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

public class Constructor_Reference {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Gautam","Pradipsinh","Karan","Pradhyumal","Om");
	
	List<Student> students = new ArrayList<Student>();
	
//	for (String name : names ) {
//		students.add(new Student(name));
//	}
	
//	students = names.stream()
//					.map(name -> new Student(name))
//					.toList();
	
	students = names.stream()
					.map(Student::new)
					.toList();
	System.out.println(students);
}
}

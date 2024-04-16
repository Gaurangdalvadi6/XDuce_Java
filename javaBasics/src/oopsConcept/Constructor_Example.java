package oopsConcept;
// 11/4/2024
class Student {
	int roll;
	String name;

	Student(){
		this.roll=10;
		this.name="Gaurang";
	}
	Student(String name) {
		this.name = name;
	}
	Student(int rollN){
		this.roll = rollN;
	}
	Student(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
	Student(Student s){
		this.name= s.name;
		this.roll= s.roll;
	}
}

public class Constructor_Example {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Java");
		Student s3 = new Student(50);
		Student s4 = new Student("Spring",15);
		Student s5 = new Student(s1);
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);
		System.out.println(s3.name+" "+s3.roll);
		System.out.println(s4.name+" "+s4.roll);
		System.out.println(s5.name+" "+s5.roll);
		
	}
}
package oopsConcept;
// 11/4/2024
//	if you declare any variable as static it need space one at declaration time so it saves the memory
//	if you change the static variable value it affect all assign variable value
//	if you declare method as static don't need to create object of method
//  if you declare any block with static keyword it is execute before the main method
class Students {
	String name;
	int age;
	static String SchoolName;
}

public class Static_Example {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.age = 10;
		s1.name = "jerry";
		s1.SchoolName = "Rajaram";

		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.SchoolName);

		Students s2 = new Students();
		System.out.println(s2.SchoolName);
		
		s2.SchoolName="vidhya sarita";
		System.out.println(s1.SchoolName);
		System.out.println(s2.SchoolName);
	}
}
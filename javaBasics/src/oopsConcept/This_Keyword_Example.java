package oopsConcept;
// 11/4/2024
class Teacher{
	int id;
	String name;
	float salary;
	public Teacher(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
//	void project() {
//		System.out.println("XDuce Java");
//	}
	
	void print() {
	//	this.project();;
		System.out.println("id :" + id+" name : "+name+" salary : "+ salary);
	}
}
public class This_Keyword_Example {
public static void main(String[] args) {
	Teacher t1 = new Teacher(1, "Gouthami", 60000);
	Teacher t2 = new Teacher(1, "Shirish", 70000);
	
	t1.print();
	t2.print();
}
}
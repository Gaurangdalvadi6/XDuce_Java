package oopsConcept;
// 11/4/2024
class Animals{
	void eat() {
		System.out.println("Eating...");
	}
}

class Deer extends Animals{
	void eat() {
		System.out.println("Eating grass");
	}
}
public class Method_Overriding {
public static void main(String[] args) {
	Deer d = new Deer();
	d.eat();
}
}

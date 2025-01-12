package oopsConcept;
// 11/4/2024
class Animal {
	String color;

	void eat() {
		System.out.println("eating..");
	}

	void breathe() {
		System.out.println("breathing...");
	}
}

class Fish extends Animal {
	int fins;

	void swim() {
		System.out.println("Swim in water.");
	}
}

public class Inheritance_Example {
	public static void main(String[] args) {
		Fish f = new Fish();
		f.eat();
		f.breathe();
		f.swim();
		f.color = "red";
		f.fins = 2;
		System.out.println(f.color);
		System.out.println(f.fins);

	}
}

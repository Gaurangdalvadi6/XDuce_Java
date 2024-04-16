package oopsConcept;
//	11/4/2024
abstract class Animalss {
	String color;
	Animalss() {
		System.out.println("animal constructor is called");
	}
	void eat() {
		System.out.println("Animal Eats...");
	}

	abstract void walk();
}

class Horse extends Animalss {
	void changeColor() {
		color = "blue";
	}
	Horse() {
		System.out.println("Horse Constructor is called");
	}
	@Override
	void walk() {
		System.out.println("Horse have four legs");
	}
}

class Duck extends Animalss {
	public Duck() {
		System.out.println("Duck constructor is called");
	}
	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Duck have two legs");
	}
}

public class Abstract_Example {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		h.walk();
		h.changeColor();
		System.out.println(h.color);
		
		Duck d = new Duck();
		d.eat();
		d.walk();
	}
}

package oopsConcept;
// 11/4/2024
class Programming_Language{
	String color;
	public Programming_Language() {
		// TODO Auto-generated constructor stub
		System.out.println("Many Programming Language Available In Market...");
	}
}

class Java extends Programming_Language{
	public Java() {
		super.color="Red";
		System.out.println("Java is One of the best Programming Language");
	}
}
public class Super_Example {
public static void main(String[] args) {
	Java j = new Java();
	System.out.println(j.color);
}
}

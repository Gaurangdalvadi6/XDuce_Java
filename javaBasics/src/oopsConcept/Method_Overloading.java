package oopsConcept;
// 11/4/2024
class Calculator{
	int sum(int a,int b) {
		return a+b;
	}
	
	float sum(float a,float b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
}

public class Method_Overloading {
public static void main(String[] args) {
	Calculator c = new Calculator();	
	System.out.println(c.sum(5, 5));
	System.out.println(c.sum(5.5f, 5.6f));
	System.out.println(c.sum(5, 5,6));
}
}

package oopsConcept;
// 11/4/2024
class Example{
	public Example() {
		this(10);
		System.out.println("Print Java");
	}
	Example(int a){
		System.out.println(a);
	}
}
public class This_Keyword_Example2 {

	public static void main(String[] args) {
		Example e = new Example();
	}
}

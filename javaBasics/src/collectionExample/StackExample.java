package collectionExample;
// 15/4/2024
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	// it follow last in first out(LIFO)
	
	Stack<String> language = new Stack<String>();
	language.push("Java");
	language.push("Python");
	language.push("Go");
	language.push("Php");
	System.out.println(language);
	System.out.println(language.peek());
	
	language.pop();
	System.out.println(language);
}
}
